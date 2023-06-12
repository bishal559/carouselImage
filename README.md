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

2.Add the dependency to your app-level build.gradle file:
dependencies {
    implementation 'com.github.bishal559:carouselImage:1.0.0'
}
```
Usage
1.In your MainActivity class, create an instance of the CarouselImage component:
```groovy
private lateinit var dataBinding: ActivityMainBinding
private val carouselList = mutableListOf<CarouselItem>()

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    initialization()
}

private fun initialization() {
    // Add carousel items to the list
    carouselList.add(CarouselItem("https://images.unsplash.com/photo-1557787163-1635e2efb160?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=752&q=80", "This is Beautiful"))
    carouselList.add(CarouselItem("https://images.unsplash.com/photo-1540039155733-5bb30b53aa14?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=667&q=80"))
    carouselList.add(CarouselItem("https://images.unsplash.com/photo-1459749411175-04bf5292ceea?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80"))
    carouselList.add(CarouselItem("https://images.unsplash.com/photo-1567942712661-82b9b407abbf?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=667&q=80", "Photo on Unsplash"))

    // Set the carousel data using DataBinding
    with(dataBinding) {
        carousel.setData(carouselList)
    }
}
```
2.In your layout XML file, add the CarouselImage component:
```
<com.carousel.ImageCarousel
            android:id="@+id/carousel"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_marginStart="10dp"
            android:layout_marginTop="10dp"
            android:layout_marginEnd="22dp"
            app:autoPlay="true"
            app:autoPlayDelay="3000"
            app:autoWidthFixing="true"
            app:bottomShadowAlpha="0.6"
            app:bottomShadowHeight="64dp"
            app:captionMargin="0dp"
            app:captionTextSize="14sp"
            app:carouselBackground="@color/white"
            app:carouselRadius="20dp"
            app:carouselElevation="0dp"
            app:carouselGravity="CENTER"
            app:carouselPadding="0dp"
            app:carouselPaddingBottom="0dp"
            app:carouselPaddingEnd="0dp"
            app:carouselPaddingStart="0dp"
            app:carouselPaddingTop="0dp"
            app:carouselType="BLOCK"
            app:imagePlaceholder="@drawable/ic_placeholder_background_image"
            app:imageScaleType="fitXY"
            app:indicatorMargin="0dp"
            app:infiniteCarousel="true"
            app:layout_constraintDimensionRatio="1:.8"
            app:layout_constraintTop_toTopOf="parent"
            app:nextButtonId="@id/btn_next"
            app:nextButtonLayout="@layout/next_button_layout"
            app:nextButtonMargin="4dp"
            app:previousButtonId="@id/btn_previous"
            app:previousButtonLayout="@layout/previous_button_layout"
            app:previousButtonMargin="4dp"
            app:scaleOnScroll="false"
            app:scalingFactor="0.15"
            app:showBottomShadow="false"
            app:showCaption="true"
            app:showIndicator="true"
            app:showNavigationButtons="false"
            app:showTopShadow="false"
            app:topShadowAlpha="0.6"
            app:topShadowHeight="32dp"
            app:touchToPause="true" />
            ```
