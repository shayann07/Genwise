# Genwise

A single-screen Kotlin Android app that takes a name and an age and labels the person as Child, Teenager, Adult, or Senior.

## Status

Educational/portfolio sample. One activity, one layout, one bucketing rule. No persistence, networking, or external services.

## Features

- Single form with a name field and a numeric age field.
- Tap **Submit**, or press the keyboard **Done** action on the age field, to evaluate the input.
- Validates that the name is non-empty and the age parses to a non-negative integer; otherwise shows a toast.
- Reveals two result lines: a "Hello, {name}!" greeting and a category label.
- Categorizes age into `Child` (<13), `Teenager` (13–19), `Adult` (20–59), or `Senior` (60+).
- Result texts start hidden and become visible after a successful submission.
- Clears focus on both inputs after evaluating.

## Tech Stack

- **Language:** Kotlin (JVM target 11).
- **UI:** Android Views with AppCompat, Material Components, and ConstraintLayout.
- **Build:** Android Gradle Plugin via `libs.versions.toml`; `compileSdk 35`, `minSdk 24`, `targetSdk 35`.
- **View Binding** enabled (`buildFeatures.viewBinding = true`).

## Project Structure

```
app/
├── build.gradle.kts
└── src/main/
    ├── AndroidManifest.xml         // single MainActivity launcher; no permissions
    ├── java/com/example/agegroupapp/MainActivity.kt
    └── res/
        ├── layout/activity_main.xml
        ├── color/text_input_stroke.xml
        └── values/, drawable/, mipmap-*/, xml/
```

The application id and namespace are `com.example.agegroupapp`; the displayed app label uses the `app_name` resource and the `Theme.AgeGroupApp` style.

## Getting Started

### Prerequisites

- Android Studio compatible with the wrapper version in `gradle/wrapper`.
- JDK 11.
- Android SDK with `compileSdk 35` and `minSdk 24`.

### Run

```bash
git clone https://github.com/shayann07/Genwise.git
```

Open the project in Android Studio, let Gradle sync, then run the `app` configuration on a device or emulator.

### Build

```bash
./gradlew :app:assembleDebug
```

The repository tracks a `local.properties`; replace its `sdk.dir` value with the path on your machine before building.

## Limitations

- Despite the project name, the app does **not** classify users into generational cohorts (Gen Z, Millennial, Boomer, etc.). It buckets a raw age number into four broad categories.
- Result strings are hardcoded English; there are no translations or accessibility-focused result components beyond the standard Material widgets.
- No data is persisted between launches.
- The application id and namespace are still the starter project's `com.example.agegroupapp`.
- Only generated example tests are present and there is no license file.
