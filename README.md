# Core UI

A reusable Android UI component library built with **Kotlin** and **Jetpack Compose**. Provides a consistent design system — typography, theming, and components — that can be dropped into any Android project as a Maven dependency.

---

## Installation

Add JitPack to your `settings.gradle.kts`:

```kotlin
dependencyResolutionManagement {
    repositories {
        maven { url = uri("https://jitpack.io") }
    }
}
```

Add the dependency in your module's `build.gradle.kts`:

```kotlin
dependencies {
    implementation("com.github.dhruv-iiitu:core-ui:1.0.2")
}
```

---

## Setup

Wrap your app (or screen) with `CoreTheme` to enable theming:

```kotlin
CoreTheme {
    // your content
}
```

It automatically switches between light and dark color schemes based on the system setting. You can override it:

```kotlin
CoreTheme(darkTheme = true) {
    // forced dark mode
}
```

---

## Components

### CoreText

A themed text component with a built-in typography scale.

```kotlin
CoreText(
    text = "Hello World",
    type = CoreTextType.HeadingLarge
)
```

#### Typography variants

| Type | Size | Weight |
|---|---|---|
| `HeadingLarge` | 24sp | Bold |
| `HeadingMedium` | 20sp | SemiBold |
| `HeadingSmall` | 16sp | Medium |
| `BodyLarge` | 16sp | Normal |
| `BodyMedium` | 14sp | Normal |
| `BodySmall` | 12sp | Normal |
| `LabelLarge` | 14sp | Medium |
| `LabelMedium` | 12sp | Medium |
| `LabelSmall` | 10sp | Medium |

#### Parameters

| Parameter | Type | Default | Description |
|---|---|---|---|
| `text` | `String` | required | Text to display |
| `type` | `CoreTextType` | required | Typography variant |
| `color` | `Color` | `onBackground` | Text color |
| `textAlign` | `TextAlign?` | `null` | Alignment |
| `textDecoration` | `TextDecoration?` | `null` | Underline, strikethrough etc. |
| `overflow` | `TextOverflow` | `Clip` | Overflow behaviour |
| `maxLines` | `Int` | `Int.MAX_VALUE` | Max lines |
| `isHtml` | `Boolean` | `false` | Parse HTML tags |

#### HTML rendering

Set `isHtml = true` to render HTML-formatted strings:

```kotlin
CoreText(
    text = "<b>Bold</b> and <i>Italic</i> and <font color='#FF0000'>Red</font>",
    type = CoreTextType.BodyMedium,
    isHtml = true
)
```

#### Semantic colors

```kotlin
CoreText("Success", CoreTextType.BodyMedium, color = CoreTheme.colors.success)
CoreText("Error",   CoreTextType.BodyMedium, color = CoreTheme.colors.error)
CoreText("Warning", CoreTextType.BodyMedium, color = CoreTheme.colors.warning)
CoreText("Primary", CoreTextType.BodyMedium, color = CoreTheme.colors.primary)
```

---

## Theme

### Color scheme

`CoreTheme.colors` exposes the following tokens:

| Token | Description |
|---|---|
| `primary` | Brand color |
| `onPrimary` | Content on primary |
| `background` | Screen background |
| `onBackground` | Default text color |
| `surface` | Card/surface background |
| `onSurface` | Content on surface |
| `success` | Green — success states |
| `error` | Red — error states |
| `warning` | Amber — warning states |

Both light and dark variants are defined out of the box.

---

## Requirements

- Min SDK: **24** (Android 7.0)
- Compile SDK: **36**
- Kotlin + Jetpack Compose

---

## Author

**Dhruv Sharma** — [github.com/dhruv-iiitu](https://github.com/dhruv-iiitu)
