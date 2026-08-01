| Feature             | MockK                            | Mockito                                                |
| ------------------- | -------------------------------- | ------------------------------------------------------ |
| Language            | Kotlin-first                     | Java-first                                             |
| Kotlin Support      | Excellent                        | Good (requires `mockito-kotlin` for better experience) |
| Final Classes       | ✅ Works by default               | ⚠️ Needs `mockito-inline`                              |
| Coroutines          | ✅ Native (`coEvery`, `coVerify`) | ⚠️ Extra setup                                         |
| Extension Functions | ✅ Can mock                       | ❌ Difficult                                            |
| Top-level Functions | ✅ Can mock                       | ❌ Not supported directly                               |
| Object/Singleton    | ✅ Easy                           | ⚠️ Limited                                             |
| Learning Curve      | Moderate                         | Easy if coming from Java                               |
| Performance         | Similar                          | Similar                                                |


# Top 20 MockK Interview Questions 

## 1. What is MockK?

**Answer:**
MockK is a Kotlin-first mocking framework used for unit testing. It supports mocking:

* Final classes
* Coroutines
* Singleton objects (`object`)
* Companion objects
* Top-level functions
* Extension functions
* Static methods

---

## 2. Why use MockK instead of Mockito?

**Answer:**

* Designed specifically for Kotlin
* Supports final classes without extra configuration
* Native coroutine support (`coEvery`, `coVerify`)
* Can mock singleton objects, extension functions, and top-level functions
* Cleaner Kotlin syntax

---

## 3. What is `mockk()`?

**Answer:**
Creates a mock object.

```kotlin
val repository = mockk<UserRepository>()
```

---

## 4. What is `every {}`?

**Answer:**
Used to define the behavior of a mocked function.

```kotlin
every { repository.getUser() } returns user
```

---

## 5. What is `verify {}`?

**Answer:**
Checks whether a mocked function was called.

```kotlin
verify { repository.getUser() }
```

Verify number of calls:

```kotlin
verify(exactly = 2) { repository.getUser() }
```

---

## 6. Difference between `every` and `verify`

| every                 | verify               |
| --------------------- | -------------------- |
| Stubs behavior        | Verifies interaction |
| Used before execution | Used after execution |

---

## 7. What is `coEvery`?

**Answer:**
Used to mock **suspend** functions.

```kotlin
coEvery { repository.fetchUser() } returns user
```

---

## 8. What is `coVerify`?

**Answer:**
Verifies calls to suspend functions.

```kotlin
coVerify { repository.fetchUser() }
```

---

## 9. Difference between `every` and `coEvery`

| every           | coEvery          |
| --------------- | ---------------- |
| Normal function | Suspend function |

---

## 10. What is a Relaxed Mock?

**Answer:**
A relaxed mock automatically returns default values for unstubbed methods.

```kotlin
val repo = mockk<UserRepository>(relaxed = true)
```

Default values:

* Int → 0
* Boolean → false
* String → ""
* List → emptyList()

---

## 11. What is `relaxUnitFun`?

**Answer:**
Automatically handles `Unit`-returning functions.

```kotlin
val logger = mockk<Logger>(relaxUnitFun = true)
```

---

## 12. What is `just Runs`?

**Answer:**
Used for methods that return `Unit`.

```kotlin
every { logger.log() } just Runs
```

---

## 13. What is `slot()`?

**Answer:**
Captures an argument passed to a mocked function.

```kotlin
val slot = slot<String>()

every {
    repository.save(capture(slot))
} returns true
```

Access the captured value:

```kotlin
println(slot.captured)
```

---

## 14. What is `capture()`?

**Answer:**
Captures method arguments for verification or assertions.

```kotlin
verify {
    repository.save(capture(slot))
}
```

---

## 15. How do you mock a Singleton (`object`)?

```kotlin
mockkObject(NetworkManager)

every {
    NetworkManager.isConnected()
} returns false

unmockkObject(NetworkManager)
```

---

## 16. How do you mock a top-level function?

```kotlin
mockkStatic(::getVersion)

every {
    getVersion()
} returns "2.0"
```

---

## 17. How do you mock constructors?

```kotlin
mockkConstructor(ApiClient::class)

every {
    anyConstructed<ApiClient>().fetch()
} returns "Success"
```

---

## 18. Difference between `clearMocks()` and `unmockkAll()`

### `clearMocks()`

* Clears recorded calls and stubbing for specific mocks.

```kotlin
clearMocks(repository)
```

### `unmockkAll()`

* Removes all object, static, and constructor mocks.

```kotlin
unmockkAll()
```

---

## 19. How do you verify call order?

```kotlin
verifyOrder {
    repository.login()
    repository.fetchUser()
}
```

Exact sequence only:

```kotlin
verifySequence {
    repository.login()
    repository.fetchUser()
}
```

---

## 20. What are MockK annotations?

```kotlin
@MockK
lateinit var repository: Repository

@InjectMockKs
lateinit var viewModel: UserViewModel

@Before
fun setup() {
    MockKAnnotations.init(this)
}
```

---

# Bonus Senior-Level Questions

### 21. Why is `coEvery` required for suspend functions?

Because suspend functions are compiled differently (using continuations). `coEvery` and `coVerify` are coroutine-aware APIs that correctly mock and verify suspend calls.

---

### 22. Why use `verify()` in tests?

To ensure the code under test interacted with its dependencies correctly, not just that it produced the expected output.

---

### 23. When should you avoid relaxed mocks?

Avoid them when you want strict tests. Relaxed mocks can hide missing stubs by returning default values instead of failing.

---

### 24. How do you test a ViewModel using MockK?

1. Mock the repository.
2. Stub responses with `every`/`coEvery`.
3. Execute the ViewModel method.
4. Assert the UI state.
5. Verify repository interactions.

---

### 25. What is the difference between a Mock and a Spy?

| Mock                          | Spy                             |
| ----------------------------- | ------------------------------- |
| Fake object                   | Wraps a real object             |
| Real methods are not executed | Real methods execute by default |
| Used for isolation            | Used to partially mock behavior |

```kotlin
val spyRepository = spyk(RealRepository())
```

This version is formatted so you can **copy and paste it directly into Google Docs, Notion, or your interview preparation sheet**.
