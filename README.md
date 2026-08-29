# 🧬 Genwise — Generational Life-Stage & Demographic Intelligence

[![Platform](https://img.shields.io/badge/Platform-Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)](https://developer.android.com)
[![Language](https://img.shields.io/badge/Language-Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![UI](https://img.shields.io/badge/UI-ViewBinding_%2B_Material_3-0052CC?style=for-the-badge&logo=android)](https://material.io/develop/android)
[![Target SDK](https://img.shields.io/badge/Target_SDK-35-green?style=for-the-badge&logo=android)](https://developer.android.com/about/versions/15)
[![License: MIT](https://img.shields.io/badge/License-MIT-green.svg?style=for-the-badge)](LICENSE)

> **Genwise** is an Android demographic classification and life-stage intelligence application designed to deliver real-time generational cohort evaluation through clean UI states, ViewBinding, and Material 3 design.

---

## 📖 Overview

Categorizing demographic data and understanding human generational life stages is fundamental across personalized UX onboarding, health assessments, and educational profiling.

**Genwise** provides a lightweight, responsive native Android implementation for evaluating age-based cohort criteria. Featuring **ViewBinding**, custom stroke input styling, and integrated IME keyboard action listeners, the app validates inputs, evaluates life-stage bounds, and dynamically renders personalized greetings and cohort classifications.

---

## 🏗️ Architecture & Classification Flow

```mermaid
flowchart TD
    subgraph Input ["User Input & Trigger"]
        NI["Name Input Field"]
        AI["Age Input Field"]
        DoneBtn["IME Done Action / Submit Button"]
    end

    subgraph Validation ["Validation Engine"]
        CheckValid{"Non-empty Name & Valid Integer >= 0?"}
        ToastErr["Show Toast Feedback & Retain Focus"]
    end

    subgraph Classifier ["Life-Stage Evaluator (MainActivity)"]
        MatchAge{"Evaluate Age Bracket"}
        Child["👶 Child (< 13)"]
        Teen["🎒 Teenager (13 - 19)"]
        Adult["💼 Adult (20 - 59)"]
        Senior["🧓 Senior (60+)"]
    end

    subgraph UI ["Dynamic State Rendering"]
        Greet["binding.greetingText.apply { text = 'Hello, {Name}!' }"]
        Result["binding.ageGroupText.apply { text = 'You are a {Cohort}.' }"]
        Clear["binding.nameInput.clearFocus() & ageInput.clearFocus()"]
    end

    NI --> DoneBtn
    AI --> DoneBtn
    DoneBtn --> CheckValid

    CheckValid -- No --> ToastErr
    CheckValid -- Yes --> MatchAge

    MatchAge -->|< 13| Child
    MatchAge -->|13..19| Teen
    MatchAge -->|20..59| Adult
    MatchAge -->|>= 60| Senior

    Child --> Greet
    Teen --> Greet
    Adult --> Greet
    Senior --> Greet

    Greet --> Result
    Result --> Clear
```

---

## ✨ Core Features

- 🎯 **Accurate Life-Stage Classification**: Multi-tier evaluation logic parsing input into distinct biological and social cohorts: `Child`, `Teenager`, `Adult`, and `Senior`.
- ⚡ **Seamless IME Done Action**: Directly trigger classification from the soft keyboard's `IME_ACTION_DONE` key for frictionless single-handed operation.
- 🛡️ **Robust Input Sanitization**: Form validation guarding against non-numeric entries, empty text buffers, and negative values with instant Toast diagnostics.
- 🎨 **Material 3 Design System**: Styled text input layouts with custom color states, focus strokes, and dynamic visibility transitions.
- 🧩 **ViewBinding Architecture**: Complete elimination of `findViewById` boilerplate for type-safe, null-safe view references.

---

## 📱 Demographic Taxonomy

| Cohort Category | Age Span | Clinical & Demographic Description |
|---|---|---|
| **👶 Child** | `< 13` years | Early developmental stage focusing on pediatric growth and foundational learning |
| **🎒 Teenager** | `13 – 19` years | Adolescent transition characterized by rapid cognitive and physical maturation |
| **💼 Adult** | `20 – 59` years | Prime working age cohort involved in professional, family, and civic life |
| **🧓 Senior** | `60+` years | Elder life-stage with focus on healthy longevity, retirement, and legacy |

---

## 🛠️ Technology Stack

| Layer / Component | Technology | Version | Purpose |
|---|---|---|---|
| **Platform** | Android | API 24 – 35 | Native Android runtime |
| **Language** | Kotlin | `2.0+` | Clean, concise application logic |
| **UI Framework** | ViewBinding + ConstraintLayout | `2.1.4` | Responsive constraint-based view hierarchy |
| **Design System** | Google Material Components | `1.12.0` | Material 3 themes and surface styling |
| **Build System** | Gradle (Kotlin DSL) | AGP `8.x` | Modern build automation |

---

## 🚀 Getting Started

### Prerequisites

- **Android Studio Ladybug** or newer.
- **JDK 11 or JDK 17**.
- **Android SDK 35**.

### Build & Run

1. Clone the repository:
   ```bash
   git clone https://github.com/shayann07/Genwise.git
   cd Genwise
   ```
2. Open in Android Studio and sync Gradle.
3. Build the debug APK:
   ```bash
   ./gradlew assembleDebug
   ```
4. Run on an Android emulator or physical device.

---

## 📄 License

This project is licensed under the [MIT License](LICENSE) — Copyright (c) 2026 [shayann07](https://github.com/shayann07).
