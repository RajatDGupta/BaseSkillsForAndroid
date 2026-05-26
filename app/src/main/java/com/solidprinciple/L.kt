package com.solidprinciple

/*
 Liskov Substitution Principle (LSP) example for Android Clean Architecture (Kotlin)

 This file contains a written walkthrough and compact Kotlin examples that demonstrate
 how to design repositories and consumers (e.g. ViewModels) so subclasses (implementations)
 can replace supertypes (interfaces) without breaking client code.

 NOTE: This file intentionally contains the tutorial and example snippets as comments
 so it is safe to include in the project without affecting compilation.

 -----------------------------------------------------------------------------
 1) What is LSP?
 -----------------------------------------------------------------------------
 The Liskov Substitution Principle states:
 "Objects of a superclass should be replaceable with objects of a subclass without
 affecting the correctness of the program."

 In Kotlin terms: code should depend on abstractions (interfaces / base classes), and
 concrete implementations should behave so that clients don't have to know which
 implementation is provided.

 -----------------------------------------------------------------------------
 2) Clean Architecture Layers
 -----------------------------------------------------------------------------
 - Domain Layer  -> Business logic, entities, use cases
 - Data Layer    -> Repository implementations, remote/local data sources
 - Presentation  -> ViewModels, UI

 We'll show LSP in the Repository pattern: a ViewModel depends on a UserRepository
 interface. Different implementations (remote, cached, etc.) can be swapped without
 changing the ViewModel.

 -----------------------------------------------------------------------------
 3) Example Scenario: UserRepository
 -----------------------------------------------------------------------------

 Domain entity (example):
 ```kotlin
 // domain/entities/User.kt

 data class User(
     val id: Int,
     val name: String,
     val email: String
 )
 ```

 Repository interface (supertype):
 ```kotlin
 // domain/repository/UserRepository.kt

 interface UserRepository {
     suspend fun getUser(userId: Int): User
 }
 ```

 -----------------------------------------------------------------------------
 4) Data Layer: Two implementations
 -----------------------------------------------------------------------------

 Remote implementation:
 ```kotlin
 // data/repository/RemoteUserRepository.kt

 class RemoteUserRepository(
     private val apiService: ApiService
 ) : UserRepository {
     override suspend fun getUser(userId: Int): User {
         val response = apiService.getUser(userId)
         return User(response.id, response.name, response.email)
     }
 }
 ```

 Cached (local) implementation:
 ```kotlin
 // data/repository/CachedUserRepository.kt

 class CachedUserRepository(
     private val userDao: UserDao
 ) : UserRepository {
     override suspend fun getUser(userId: Int): User {
         val entity = userDao.getUserById(userId)
         return User(entity.id, entity.name, entity.email)
     }
 }
 ```

 Both implementations honor the `UserRepository` contract and can be substituted
 wherever the interface is used. This is LSP compliance.

 -----------------------------------------------------------------------------
 5) Presentation Layer: ViewModel expects interface only
 -----------------------------------------------------------------------------
 ```kotlin
 // presentation/viewmodel/UserViewModel.kt

 class UserViewModel(
     private val userRepository: UserRepository
 ) : ViewModel() {

     private val _user = MutableLiveData<User>()
     val user: LiveData<User> = _user

     fun loadUser(userId: Int) {
         viewModelScope.launch {
             val userData = userRepository.getUser(userId)
             _user.postValue(userData)
         }
     }
 }
 ```

 The ViewModel code does not care which `UserRepository` implementation is injected.
 That is LSP in practice.

 -----------------------------------------------------------------------------
 6) DI Example (Hilt) — swapping implementations
 -----------------------------------------------------------------------------
 ```kotlin
 @Module
 @InstallIn(SingletonComponent::class)
 object RepositoryModule {

     @Provides
     fun provideUserRepository(
         apiService: ApiService,
         userDao: UserDao
     ): UserRepository {
         // Switch here between remote or cached implementation as needed
         return RemoteUserRepository(apiService)
     }
 }
 ```

 -----------------------------------------------------------------------------
 7) Example of an LSP violation (and fix)
 -----------------------------------------------------------------------------
 Violation:
 Suppose we change the interface to return a nullable User? or throw specific exceptions
 that only some implementations honor. Example:
 ```kotlin
 interface UserRepository {
     // Violation: some implementations return null, others throw.
     suspend fun getUser(userId: Int): User?
 }
 ```
 If client code expects non-null user and an implementation returns null, client code
 will break. Better to clearly define the contract (throw or return Result/ sealed type)
 so all implementations follow the same behavior.

 Fix (explicit Result type):
 ```kotlin
 sealed class Result<out T> {
     data class Success<T>(val value: T) : Result<T>()
     data class Failure(val throwable: Throwable) : Result<Nothing>()
 }

 interface UserRepository {
     suspend fun getUser(userId: Int): Result<User>
 }
 ```
 Now every implementation must return a Result, making behavior uniform and substitutable.

 -----------------------------------------------------------------------------
 Key Points / Best Practices
 -----------------------------------------------------------------------------
 1. Depend on abstractions (interfaces) in the Domain / Presentation layers.
 2. Define clear contracts: nullability, exceptions, and return types should be
    consistent across implementations.
 3. Use sealed types or Result wrappers to represent success/failure explicitly.
 4. Keep implementations substitutable: don't leak implementation-specific side
    effects or assumptions into the interface contract.

 -----------------------------------------------------------------------------
 Want a practical change? I can:
 - Insert real example Kotlin files into the appropriate `domain`, `data`, and
   `presentation` packages in this project (with working small implementations),
 - Or produce a failing example and then show the fix (LSP violation -> corrected).

 If you want me to generate files, tell me which option you prefer and I'll add them
 under `app/src/main/java/com/solidprinciple/` (or create proper package folders).
 */
