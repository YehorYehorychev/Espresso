# Welcome to the Quiz app.

## It's a simple Android app that you can run on an emulator or phone. 

### Espresso tests
The tests in this project are Espresso tests, and uses a Robot Pattern test design. 
The tests can be run with the IDE or using:
```./gradlew connectedAndroidTest -Pandroid.testInstrumentationRunnerArguments.size=large```

### 🔖 Note:
All new UI tests must be annotated with:

``@LargeTest``

## 🖼 Screenshot Tests

The project also includes screenshot tests. These tests take a screenshot of the given activity and compare it with a previously recorded baseline.

## 📸 Recording Screenshots

To record new baseline screenshots:

``./gradlew executeScreenshotTests -Pandroid.testInstrumentationRunnerArguments.size=small -Precord``

## ✅ Running Screenshot Tests

To execute the screenshot tests and compare against the baseline:

``./gradlew executeScreenshotTests -Pandroid.testInstrumentationRunnerArguments.size=small``


🔖 Note:
All new screenshot tests must be annotated with:

``@SmallTest``

### Examples of the most frequent espresso methods:

🔎 Finding Views:
```
onView(withId(R.id.view_id))                  // By ID
onView(withText("Some text"))                 // By text
onView(withContentDescription("Description")) // By contentDescription
onView(withHint("Enter name"))                // By hint
onView(isAssignableFrom(EditText::class.java))// By view type
onView(allOf(withId(R.id.view), isDisplayed())) // Combine conditions
onView(withTagValue(`is`("customTag")))       // By tag
```

🖱 View Actions
```
onView(withId(R.id.button)).perform(click())          // Click
onView(withId(R.id.input)).perform(typeText("Hello")) // Type text
onView(withId(R.id.input)).perform(replaceText("Hi")) // Replace text
onView(withId(R.id.input)).perform(clearText())       // Clear field
onView(withId(R.id.input)).perform(closeSoftKeyboard()) // Close keyboard

onView(withId(R.id.view)).perform(swipeLeft())   // Swipe left
onView(withId(R.id.view)).perform(swipeRight())  // Swipe right
onView(withId(R.id.view)).perform(swipeUp())     // Swipe up
onView(withId(R.id.view)).perform(swipeDown())   // Swipe down

onView(withId(R.id.view)).perform(longClick())   // Long press
onView(withId(R.id.view)).perform(doubleClick()) // Double tap
```

✅ Assertions
```
onView(withId(R.id.view)).check(matches(isDisplayed()))       // Is displayed
onView(withId(R.id.view)).check(matches(isCompletelyDisplayed())) // Fully visible
onView(withId(R.id.view)).check(matches(not(isDisplayed())))   // Not displayed

onView(withId(R.id.text)).check(matches(withText("Hello")))    // Text matches
onView(withId(R.id.text)).check(matches(containsString("He"))) // Text contains substring
onView(withId(R.id.text)).check(matches(withHint("Enter name"))) // Hint check

onView(withId(R.id.checkbox)).check(matches(isChecked()))     // Checkbox is checked
onView(withId(R.id.checkbox)).check(matches(isNotChecked()))  // Checkbox is not checked
```

📜 Lists (RecyclerView / AdapterView)
```
onData(anything()).inAdapterView(withId(R.id.list))
    .atPosition(0).perform(click())   // Click item in list

onView(withId(R.id.recycler))
    .perform(RecyclerViewActions.scrollToPosition<ViewHolder>(10)) // Scroll to position

onView(withId(R.id.recycler))
    .perform(RecyclerViewActions.actionOnItemAtPosition<ViewHolder>(2, click())) // Click item at position
```

⏳ Waiting:
Espresso waits automatically, but you can add custom waits:
```
onView(isRoot()).perform(waitFor(2000)) // Custom wait

// Example custom action:
fun waitFor(delay: Long): ViewAction {
    return object : ViewAction {
        override fun getConstraints() = isRoot()
        override fun getDescription() = "Wait for $delay millis."
        override fun perform(uiController: UiController, view: View?) {
            uiController.loopMainThreadForAtLeast(delay)
        }
    }
}
```

🔄 Extra Actions
```
pressBack()                // Press system back button
pressImeActionButton()     // Press Enter/Go/Send on keyboard
openActionBarOverflowOrOptionsMenu(getInstrumentation().targetContext) // Open overflow menu
```

🧩 Matchers (Hamcrest + Espresso)
```
allOf(withId(R.id.view), withText("OK"))   // All conditions must match
anyOf(withText("OK"), withText("Yes"))     // At least one condition
not(withText("Cancel"))                    // Negation
containsString("Login")                    // Contains substring
startsWith("User")                         // Starts with
endsWith("Name")                           // Ends with
```
