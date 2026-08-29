# Genwise

[![Platform](https://img.shields.io/badge/Platform-Android-3DDC84?logo=android&logoColor=white)]()
[![Language](https://img.shields.io/badge/Language-Kotlin-7F52FF?logo=kotlin&logoColor=white)]()
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

> A tiny one-screen app â€” type in your age and it tells you which life stage you're in (child, teen, adult, and so on). Built as a Kotlin practice exercise.

---

## 📖 Overview

A tiny one-screen app â€” type in your age and it tells you which life stage you're in (child, teen, adult, and so on). Built as a Kotlin practice exercise.

---

## ✨ Key Features

- Single form with a name field and a numeric age field.
- Tap **Submit**, or press the keyboard **Done** action on the age field, to evaluate the input.
- Validates that the name is non-empty and the age parses to a non-negative integer; otherwise shows a toast.
- Reveals two result lines: a "Hello, {name}!" greeting and a category label.
- Categorizes age into `Child` (<13), `Teenager` (13–19), `Adult` (20–59), or `Senior` (60+).
- Result texts start hidden and become visible after a successful submission.
- Clears focus on both inputs after evaluating.

---

## 🛠️ Technology Stack

| Component / Layer | Technology |
|---|---|
| **Platform** | Android |
| **Primary Language** | Kotlin |
| **Architecture** | MVVM / Clean Architecture |
| **License** | Open Source (MIT) |

---

## 🚀 Getting Started

### Prerequisites
- Android Studio Ladybug (or newer)
- JDK 17 / 21
- Android SDK 34 / 35

### Build & Run
1. Clone the repository:
   ```bash
   git clone https://github.com/shayann07/Genwise.git
   cd Genwise
   ```
2. Open the project in **Android Studio**.
3. Sync Gradle dependencies and run on an emulator or physical device.

---

## 📄 License

This project is licensed under the [MIT License](LICENSE) — Copyright (c) 2026 [shayann07](https://github.com/shayann07).
