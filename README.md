# Customizable CarouselImage with DataBinding for Android (Kotlin)


<img width="261" alt="Screenshot 2023-06-12 at 16 36 47" src="https://github.com/bishal559/carouselImage/assets/65449966/6446964f-a611-4346-9d69-fbd26c99f9b2">
<img width="286" alt="Screenshot 2023-06-12 at 16 36 54" src="https://github.com/bishal559/carouselImage/assets/65449966/782c334a-9de3-44cf-b3d1-99139bcff094">
<img width="266" alt="Screenshot 2023-06-12 at 16 37 29" src="https://github.com/bishal559/carouselImage/assets/65449966/4907a93c-f0d2-4230-bda6-65c20e66753e">
<img width="276" alt="Screenshot 2023-06-12 at 16 37 39" src="https://github.com/bishal559/carouselImage/assets/65449966/8e437dc9-223a-4066-8e51-1c36457c74f9">

Customizable CarouselImage is a powerful and customizable image carousel component for Android applications, implemented in Kotlin and utilizing DataBinding. This feature allows developers to easily integrate an interactive image carousel into their Android apps, providing a visually appealing and user-friendly experience.

## Key Features

- **Seamless DataBinding Integration**: The CarouselImage component seamlessly integrates with the DataBinding framework, enabling efficient and clean data-driven UI updates.
- **Easy Customization**: Customize the appearance and behavior of the CarouselImage component to match your app's design and requirements. Options include image sources, transition animations, carousel indicators, and more.
- **Dynamic Image Loading**: Supports dynamic image loading from various sources, such as remote URLs, local resources, or custom implementations.
- **Gesture Support**: Users can swipe left or right to navigate through the carousel images, enhancing the overall user experience.
- **Efficient Memory Management**: Optimized memory usage ensures smooth scrolling and image loading, even with a large number of images.

## Installation

To use the CarouselImage component in your Android project, follow these steps:

1. Add the JitPack repository to your root `build.gradle` file:

```groovy
allprojects {
    repositories {
        // Other repositories
        maven { url 'https://jitpack.io' }
    }
}
