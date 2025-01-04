# Android Studio Project - Jetpack Compose Tutorial

## Overview
This project demonstrates the use of Jetpack Compose to create a simple and stylish UI in an Android application. The main focus is on combining an image and descriptive text in a clean layout.

### Key Highlights:
- **Modern UI** built with Jetpack Compose.
- Simplified and declarative UI development using Kotlin.
- Integration of responsive components for an intuitive layout.

---

## Project Components

### **MainActivity.kt**
This is the entry point of the application. The primary composable functions are:

- **`ImageCard`**:
  - Displays an image followed by descriptive text.
  - Uses `Image` composable for rendering the visual element.
  - Calls `Texts` composable for text rendering.

- **`Texts`**:
  - Accepts three text parameters to display titles and descriptions.
  - Ensures proper spacing and alignment for readability.

---

## Layout Details

### **UI Elements**:
1. **Image**:
   - Rendered using the `Image` composable.
   - Scales dynamically to fit the width of the screen.

2. **Text**:
   - Titles and descriptions styled with font size and spacing.

### **Structure**:
- **Column Layout**:
  - Aligns the image and text vertically.
  - Padding ensures appropriate spacing between components.

---

## How to Run
1. Clone or download the project files.
2. Open the project in **Android Studio**.
3. Add the required image resource (e.g., `bg_compose_background___android_`) to the `res/drawable` folder.
4. Sync Gradle and run the project on an emulator or device.

---

## Code Highlights

### **Displaying an Image**:
```kotlin
Image(
    painter = painterResource(id = R.drawable.bg_compose_background___android_),
    contentDescription = null,
    modifier = Modifier.fillMaxWidth()
)
```

### **Rendering Text**:
```kotlin
Text(
    text = "Jetpack Compose tutorial",
    fontSize = 33.sp,
    modifier = Modifier.padding(bottom = 4.dp)
)
```

### **Preview Function**:
```kotlin
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidStudioProjectTheme {
        ImageCard(
            Text1 = "Jetpack Compose tutorial",
            Text2 = "Jetpack Compose simplifies UI development...",
            Text3 = "Learn how to create declarative UIs efficiently."
        )
    }
}
```

---

## Troubleshooting Tips
1. **Image Not Loading**:
   - Confirm the image resource exists in `res/drawable`.
   - Verify the resource ID in the `painterResource` function.

2. **Text Overflow**:
   - Adjust padding or ensure the `Column` layout has sufficient spacing.

3. **Preview Not Working**:
   - Update Compose dependencies to the latest versions.

---

## License
Feel free to use and modify this project for personal or educational purposes.

---

## Author
- **Name**: Suyog Shejal
- **Email**: suyogshejal2004@gmail.com

Enhance the project further by experimenting with additional composables and styles!

