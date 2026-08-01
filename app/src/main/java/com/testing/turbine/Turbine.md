

# Top 20 Turbine Interview Questions (Copy-Friendly)

---

## 1. What is Turbine?

**Answer:**
Turbine is a testing library from **Cash App** used to test **Kotlin Flow**, **StateFlow**, and **SharedFlow**. It makes it easy to verify emitted values, completion, and errors in coroutine-based streams.

---

## 2. Why do we use Turbine?

**Answer:**

* Test `Flow`, `StateFlow`, and `SharedFlow`
* Verify emitted values in order
* Test completion and exceptions
* Simplifies coroutine testing
* Works well with `runTest`

---

## 3. What dependency is required?

```gradle
testImplementation("app.cash.turbine:turbine:1.1.0")
testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:<version>")
```

---

## 4. What is `test {}`?

**Answer:**
Starts collecting a Flow and allows assertions on emitted items.

```kotlin
flow.test {

}
```

---

## 5. How do you verify emitted values?

```kotlin
@Test
fun flowTest() = runTest {

    flowOf(1, 2, 3).test {

        assertEquals(1, awaitItem())
        assertEquals(2, awaitItem())
        assertEquals(3, awaitItem())

        awaitComplete()
    }
}
```

---

## 6. What does `awaitItem()` do?

**Answer:**
Waits for and returns the next emitted value.

```kotlin
val value = awaitItem()
```

---

## 7. What is `awaitComplete()`?

**Answer:**
Verifies that the Flow completes successfully.

```kotlin
awaitComplete()
```

---

## 8. What is `awaitError()`?

**Answer:**
Verifies that the Flow throws an exception.

```kotlin
flow.test {

    val error = awaitError()

    assertTrue(error is IllegalStateException)
}
```

---

## 9. What is `cancelAndIgnoreRemainingEvents()`?

**Answer:**
Stops collecting the Flow without checking remaining emissions.

```kotlin
flow.test {

    assertEquals(1, awaitItem())

    cancelAndIgnoreRemainingEvents()
}
```

Useful for infinite flows like `StateFlow`.

---

## 10. Why use `runTest` with Turbine?

**Answer:**
`runTest` provides a controlled coroutine test environment, ensuring deterministic execution and virtual time support.

```kotlin
@Test
fun testFlow() = runTest {

}
```

---

## 11. How do you test a StateFlow?

```kotlin
@Test
fun stateFlowTest() = runTest {

    val state = MutableStateFlow(0)

    state.test {

        assertEquals(0, awaitItem())

        state.value = 1

        assertEquals(1, awaitItem())
    }
}
```

---

## 12. How do you test a SharedFlow?

```kotlin
@Test
fun sharedFlowTest() = runTest {

    val flow = MutableSharedFlow<String>()

    launch {
        flow.emit("Android")
    }

    flow.test {

        assertEquals("Android", awaitItem())
    }
}
```

---

## 13. How do you test a ViewModel StateFlow?

```kotlin
@Test
fun loadUserTest() = runTest {

    coEvery {
        repository.getUser()
    } returns User("Neeraj")

    viewModel.state.test {

        viewModel.loadUser()

        assertEquals(
            UiState.Success(User("Neeraj")),
            awaitItem()
        )
    }
}
```

---

## 14. Difference between `Flow.first()` and Turbine?

| Flow.first()             | Turbine                          |
| ------------------------ | -------------------------------- |
| Reads one value          | Tests multiple emissions         |
| Cannot verify completion | Can verify completion and errors |
| Limited assertions       | Rich testing API                 |

---

## 15. How do you test multiple emissions?

```kotlin
flow.test {

    assertEquals(1, awaitItem())
    assertEquals(2, awaitItem())
    assertEquals(3, awaitItem())

    awaitComplete()
}
```

---

## 16. How do you test exceptions?

```kotlin
flow.test {

    val exception = awaitError()

    assertTrue(
        exception is IllegalArgumentException
    )
}
```

---

## 17. Why is Turbine better than collecting Flow manually?

**Answer:**

* Cleaner syntax
* Built-in assertions
* Handles timing correctly
* Supports completion and error verification
* Less boilerplate

---

## 18. Can Turbine test infinite Flows?

**Answer:**
Yes.

Use:

```kotlin
cancelAndIgnoreRemainingEvents()
```

to stop collecting.

---

## 19. Can Turbine test StateFlow and SharedFlow?

**Answer:**
Yes.

Supports:

* Flow
* StateFlow
* SharedFlow
* Channel converted to Flow

---

## 20. What are Turbine's most commonly used APIs?

```kotlin
test { }

awaitItem()

awaitComplete()

awaitError()

expectNoEvents()

cancel()

cancelAndIgnoreRemainingEvents()
```

---

# Bonus Senior-Level Questions

### 21. Why is Turbine preferred for Flow testing?

Because it provides a concise API to verify emissions, completion, and errors while integrating seamlessly with coroutine testing.

---

### 22. What is `expectNoEvents()`?

Checks that no value is emitted during the observation period.

```kotlin
flow.test {

    expectNoEvents()
}
```

---

### 23. How do you test a loading → success sequence?

```kotlin
viewModel.state.test {

    viewModel.loadData()

    assertEquals(
        UiState.Loading,
        awaitItem()
    )

    assertEquals(
        UiState.Success(data),
        awaitItem()
    )
}
```

---

### 24. What happens if you don't consume all emissions?

Turbine fails the test with an error indicating there are unconsumed events. For infinite flows, call:

```kotlin
cancelAndIgnoreRemainingEvents()
```

---

### 25. How do MockK and Turbine work together?

* **MockK** mocks repository or use case responses.
* **Turbine** verifies the `Flow`/`StateFlow` emissions from the ViewModel.

Example:

```kotlin
@Test
fun loadUsersTest() = runTest {

    coEvery {
        repository.getUsers()
    } returns listOf(User("Neeraj"))

    viewModel.users.test {

        viewModel.loadUsers()

        assertEquals(
            UiState.Loading,
            awaitItem()
        )

        assertEquals(
            UiState.Success(listOf(User("Neeraj"))),
            awaitItem()
        )
    }
}
```

These are the most frequently asked Turbine questions in Android interviews, especially for testing ViewModels, StateFlow, SharedFlow, and coroutine-based architectures.
