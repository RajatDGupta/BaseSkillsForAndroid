

For a **7.5+ years Senior Android Developer** interview, Hilt questions are often asked from basic to advanced levels. Here are the **top Hilt interview questions with concise answers**.

---

# Hilt Interview Questions (Top 30)

## 1. What is Hilt?

Hilt is Google's dependency injection library for Android built on top of Dagger.

**Benefits**

* Less boilerplate
* Lifecycle-aware
* Compile-time dependency graph
* Easy testing
* Standardized Android DI

---

## 2. Why use Hilt instead of Dagger?

| Dagger                    | Hilt                      |
| ------------------------- | ------------------------- |
| More boilerplate          | Less boilerplate          |
| Manual component creation | Auto-generated components |
| Difficult setup           | Easy setup                |
| More annotations          | Fewer annotations         |
| Manual lifecycle handling | Lifecycle-aware           |

---

## 3. What is Dependency Injection?

Instead of creating objects yourself, another class provides them.

Without DI

```kotlin
class UserRepository {
    private val api = ApiService()
}
```

With DI

```kotlin
class UserRepository @Inject constructor(
    private val api: ApiService
)
```

---

## 4. What annotations are commonly used?

* `@HiltAndroidApp`
* `@AndroidEntryPoint`
* `@Inject`
* `@Module`
* `@Provides`
* `@Binds`
* `@InstallIn`
* `@Singleton`
* `@Qualifier`

---

## 5. What does `@HiltAndroidApp` do?

Placed on the Application class.

```kotlin
@HiltAndroidApp
class MyApp : Application()
```

It generates the application-level dependency container.

---

## 6. Why do we use `@AndroidEntryPoint`?

Enables dependency injection into

* Activity
* Fragment
* Service
* View
* BroadcastReceiver

Example

```kotlin
@AndroidEntryPoint
class MainActivity : AppCompatActivity()
```

---

## 7. What does `@Inject` do?

Tells Hilt how to create an object.

```kotlin
class UserRepository @Inject constructor(
    val api: ApiService
)
```

---

## 8. What is a Module?

A module tells Hilt how to create dependencies that you cannot annotate with `@Inject`.

```kotlin
@Module
@InstallIn(SingletonComponent::class)
object NetworkModule
```

---

## 9. When do we use `@Provides`?

Use when you don't own the class.

Example

* Retrofit
* Room
* OkHttp
* SharedPreferences

```kotlin
@Provides
fun provideRetrofit(): Retrofit
```

---

## 10. When do we use `@Binds`?

Use for interface implementations.

```kotlin
interface UserRepo

class UserRepoImpl @Inject constructor(): UserRepo
```

```kotlin
@Binds
abstract fun bindRepo(
    impl: UserRepoImpl
): UserRepo
```

---

# 11. Difference between `@Provides` and `@Binds`

| @Provides               | @Binds                            |
| ----------------------- | --------------------------------- |
| Creates object manually | Binds interface to implementation |
| Works in object module  | Works in abstract module          |
| More code               | Less code                         |
| Can contain logic       | No logic                          |

---

# 12. What is `@InstallIn`?

Specifies the component where dependency lives.

```kotlin
@Module
@InstallIn(SingletonComponent::class)
```

---

# 13. What components does Hilt provide?

| Component                 | Lifetime                       |
| ------------------------- | ------------------------------ |
| SingletonComponent        | Entire app                     |
| ActivityRetainedComponent | Survives configuration changes |
| ViewModelComponent        | ViewModel                      |
| ActivityComponent         | Activity                       |
| FragmentComponent         | Fragment                       |
| ViewComponent             | View                           |
| ServiceComponent          | Service                        |

---

# 14. Difference between ActivityComponent and ActivityRetainedComponent

ActivityComponent

* Destroyed on rotation

ActivityRetainedComponent

* Survives rotation

---

# 15. What is Singleton?

Only one instance throughout the app.

```kotlin
@Singleton
```

---

# 16. How do you inject ViewModel?

```kotlin
@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repo: UserRepository
): ViewModel()
```

Compose

```kotlin
val vm: HomeViewModel = hiltViewModel()
```

---

# 17. Difference between `viewModel()` and `hiltViewModel()`

`viewModel()`

* Creates ViewModel manually or via default factory.

`hiltViewModel()`

* Gets ViewModel from Hilt with injected dependencies.

---

# 18. What is a Qualifier?

Used when multiple implementations exist.

```kotlin
@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class AuthRetrofit
```

---

# 19. Why do we need Qualifiers?

Suppose two Retrofit instances.

* Auth API
* Product API

Without Qualifier, Hilt won't know which one to inject.

---

# 20. Can Hilt inject interfaces directly?

No.

Use

```kotlin
@Binds
```

or

```kotlin
@Provides
```

---

# 21. Can Hilt inject Retrofit?

Yes.

```kotlin
@Provides
fun provideRetrofit(): Retrofit
```

---

# 22. Can Hilt inject Room?

Yes.

Database

DAO

Repository

All can be injected.

---

# 23. How is Hilt used in Jetpack Compose?

```kotlin
@AndroidEntryPoint
class MainActivity : ComponentActivity()
```

```kotlin
val vm: HomeViewModel = hiltViewModel()
```

---

# 24. How do you inject into Worker?

Use Hilt integration with WorkManager.

```kotlin
@HiltWorker
```

---

# 25. How do you inject into Navigation Compose?

```kotlin
composable("home") {
    val vm = hiltViewModel<HomeViewModel>()
}
```

---

# 26. How do you test Hilt?

* `@HiltAndroidTest`
* `HiltAndroidRule`
* Replace modules using `@TestInstallIn`

---

# 27. Common Hilt interview mistakes

* Forgetting `@AndroidEntryPoint`
* Missing `@InstallIn`
* Multiple bindings without qualifiers
* Injecting interface without `@Binds`
* Missing `@HiltAndroidApp`

---

# 28. How does Hilt improve app architecture?

* Loose coupling
* Easier testing
* Better scalability
* Centralized dependency management
* Lifecycle-aware injection

---

# 29. What are common scopes in Hilt?

| Scope                     | Lifetime                              |
| ------------------------- | ------------------------------------- |
| `@Singleton`              | Entire application                    |
| `@ActivityRetainedScoped` | Activity across configuration changes |
| `@ViewModelScoped`        | ViewModel                             |
| `@ActivityScoped`         | Activity instance                     |
| `@FragmentScoped`         | Fragment instance                     |
| `@ViewScoped`             | View                                  |
| `@ServiceScoped`          | Service                               |

---

# 30. Senior-Level Question: Explain the dependency flow in an MVVM app using Hilt.

```
Application
        │
        ▼
SingletonComponent
        │
        ▼
Retrofit
OkHttp
Database
Preferences
        │
        ▼
Repository
        │
        ▼
ViewModelComponent
        │
        ▼
HomeViewModel
        │
        ▼
Activity / Fragment / Compose Screen
```

The UI requests a `HomeViewModel` using `hiltViewModel()`. Hilt creates the ViewModel, injects the `UserRepository`, and the repository receives shared dependencies like `Retrofit` or `Room` from the `SingletonComponent`. This ensures dependencies are reused according to their scope and are easy to replace during testing.

### Frequently asked follow-up questions

* Explain Hilt's generated component hierarchy.
* How does Hilt handle circular dependencies?
* When would you choose `@Provides` over `@Binds`?
* How do you inject different Retrofit instances using qualifiers?
* What is the difference between `@Singleton` and `@ActivityRetainedScoped`?
* How do you replace a production module in instrumented tests?
* What causes "duplicate binding" and "missing binding" compile errors, and how do you fix them?
* How do you inject dependencies into a `Worker`, `ContentProvider`, or custom `View`?
* How does Hilt work with multi-module Android projects?
* What are entry points (`@EntryPoint`) and when are they needed?

These questions cover most Hilt topics commonly asked in senior Android interviews at product companies.


