

# Top 20 Jetpack Compose Testing Interview Questions 

---

## 1. What is Jetpack Compose Testing?

**Answer:**
Jetpack Compose Testing is a framework for testing Compose UI. It allows you to verify UI behavior, user interactions, semantics, and state changes without relying on view IDs.

---

## 2. Which dependency is required for Compose UI testing?

```gradle
androidTestImplementation("androidx.compose.ui:ui-test-junit4:<version>")
debugImplementation("androidx.compose.ui:ui-test-manifest:<version>")
```

---

## 3. What is `createComposeRule()`?

**Answer:**
It creates a Compose test environment for testing Composables.

```kotlin
@get:Rule
val composeTestRule = createComposeRule()
```

---

## 4. What is `createAndroidComposeRule()`?

**Answer:**
Used when testing an Activity.

```kotlin
@get:Rule
val composeTestRule =
    createAndroidComposeRule<MainActivity>()
```

### Difference

| createComposeRule()   | createAndroidComposeRule()    |
| --------------------- | ----------------------------- |
| Tests only Composable | Launches Activity             |
| Faster                | Used for integration/UI tests |

---

## 5. How do you set the UI for testing?

```kotlin
composeTestRule.setContent {
    LoginScreen()
}
```

---

## 6. How do you find a UI element?

By Text

```kotlin
composeTestRule
    .onNodeWithText("Login")
```

By Tag

```kotlin
composeTestRule
    .onNodeWithTag("LOGIN_BUTTON")
```

By Content Description

```kotlin
composeTestRule
    .onNodeWithContentDescription("Back")
```

---

## 7. Why use `Modifier.testTag()`?

**Answer:**
Adds a unique identifier to a Composable for testing.

```kotlin
Button(
    modifier = Modifier.testTag("LOGIN_BUTTON"),
    onClick = {}
) { }
```

---

## 8. How do you perform a click?

```kotlin
composeTestRule
    .onNodeWithTag("LOGIN_BUTTON")
    .performClick()
```

---

## 9. How do you enter text?

```kotlin
composeTestRule
    .onNodeWithTag("EMAIL")
    .performTextInput("test@gmail.com")
```

---

## 10. How do you verify text is displayed?

```kotlin
composeTestRule
    .onNodeWithText("Welcome")
    .assertIsDisplayed()
```

---

## 11. Difference between `assertExists()` and `assertIsDisplayed()`

| assertExists                  | assertIsDisplayed |
| ----------------------------- | ----------------- |
| Node exists in semantics tree | Visible on screen |

---

## 12. How do you verify a button is enabled?

```kotlin
composeTestRule
    .onNodeWithTag("LOGIN_BUTTON")
    .assertIsEnabled()
```

Disabled

```kotlin
.assertIsNotEnabled()
```

---

## 13. How do you verify text?

```kotlin
composeTestRule
    .onNodeWithTag("USERNAME")
    .assertTextEquals("Neeraj")
```

---

## 14. How do you verify a node doesn't exist?

```kotlin
composeTestRule
    .onNodeWithText("Error")
    .assertDoesNotExist()
```

---

## 15. How do you scroll a LazyColumn?

```kotlin
composeTestRule
    .onNodeWithTag("LIST")
    .performScrollToNode(
        hasText("Android")
    )
```

---

## 16. How do you test a TextField?

```kotlin
composeTestRule
    .onNodeWithTag("EMAIL")
    .performTextInput("abc@gmail.com")

composeTestRule
    .onNodeWithTag("EMAIL")
    .assertTextEquals("abc@gmail.com")
```

---

## 17. What is the Semantics Tree?

**Answer:**
The Semantics Tree exposes UI properties (text, content descriptions, state, actions) to testing and accessibility services. Compose tests interact with this tree instead of View IDs.

---

## 18. How do you inspect the Semantics Tree?

```kotlin
composeTestRule.onRoot().printToLog("ComposeTest")
```

Useful for debugging when a node can't be found.

---

## 19. How do you test navigation?

```kotlin
composeTestRule
    .onNodeWithText("Profile")
    .performClick()

composeTestRule
    .onNodeWithText("Profile Screen")
    .assertIsDisplayed()
```

You can use a `TestNavHostController` to verify navigation destinations.

---

## 20. How do you test state changes?

```kotlin
composeTestRule
    .onNodeWithTag("COUNTER")
    .assertTextEquals("0")

composeTestRule
    .onNodeWithTag("ADD")
    .performClick()

composeTestRule
    .onNodeWithTag("COUNTER")
    .assertTextEquals("1")
```

---

# Bonus Senior-Level Questions

### 21. Difference between UI Test and Unit Test?

| Unit Test            | UI Test                |
| -------------------- | ---------------------- |
| Tests business logic | Tests UI behavior      |
| Fast                 | Slower                 |
| Uses JUnit/MockK     | Uses Compose Test APIs |

---

### 22. Why use `testTag()` instead of text?

**Answer:**

* Text may change due to localization or design updates.
* `testTag()` provides a stable and unique identifier for tests.

---

### 23. What is `waitForIdle()`?

```kotlin
composeTestRule.waitForIdle()
```

Waits until Compose finishes recompositions and pending UI work before making assertions.

---

### 24. How do you test a ViewModel with Compose?

* Mock dependencies using MockK.
* Provide the ViewModel to the Composable.
* Set the content.
* Perform user actions.
* Assert UI updates based on ViewModel state.

---

### 25. What are best practices for Compose testing?

* Use `Modifier.testTag()` for stable selectors.
* Test user behavior, not implementation details.
* Keep UI tests focused and independent.
* Use MockK to isolate ViewModel and repository dependencies.
* Prefer assertions on visible UI state rather than internal variables.

These questions cover the most common Compose testing topics asked in Android interviews, especially for senior Android developer roles.


