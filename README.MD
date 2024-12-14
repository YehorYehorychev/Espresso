Welcome to the Quiz app.

It's a simple Android app that you can run on an emulator or phone. 

### Espresso tests
The tests in this project are Espresso tests, and uses a Robot Pattern test design. 
The tests can be run with the IDE or using:
```./gradlew connectedAndroidTest -Pandroid.testInstrumentationRunnerArguments.size=large```
All new UI tests must be annotated with `@LargeTest`

### Screenshot tests
There are also screenshot tests, these will take and compare a screenshot of the given activity.
To *record* the screenshots run:
```./gradlew executeScreenshotTests -Pandroid.testInstrumentationRunnerArguments.size=small -Precord```

To *execute* the screenshot tests run:
```./gradlew executeScreenshotTests -Pandroid.testInstrumentationRunnerArguments.size=small```

All new screenshot tests must be annotated with `@SmallTest`.