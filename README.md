# KMP PhotoPool

## Overview

This project is a **Kotlin Multiplatform Mobile (KMP)** application that works across multiple platforms, including **iOS**, **Android**, and **Desktop**. The application fetches image data from the **Unsplash API** (https://api.unsplash.com) to display images. The app follows the **Clean Architecture** design pattern using **MVVM** (Model-View-ViewModel) and **Repository** layers for better separation of concerns and maintainability.

## Features

- Cross-platform support for **Android**, **iOS**, and **Desktop**.
- Fetches image data from the **Unsplash API**.
- Implements **Clean Architecture** with **MVVM** and **Repository** patterns.
- Provides efficient image loading and caching with **Coil**.
- HTTP requests handled using **Ktor**.
- **Koin** is used for dependency injection across the app.
- UI designed using **Jetpack Compose** (Android) and other native tools for other platforms.

## Tech Stack

- **Kotlin Multiplatform Mobile (KMP)**: Enables sharing code across Android, iOS, and Desktop.
- **Unsplash API**: Provides free, high-quality images for display in the app.
- **Coil**: An image loading library used for efficient image handling and caching.
- **Ktor**: An HTTP client for making network requests to the Unsplash API.
- **Koin**: A dependency injection framework for Kotlin, used to manage dependencies in the app.
- **Jetpack Compose**: Used for building native UIs on Android with a declarative syntax.
- **Clean Architecture**: Ensures separation of concerns and scalability with MVVM and Repository patterns.

## Architecture

This project follows **Clean Architecture**, organizing the code into distinct layers:

- **Presentation Layer**: Contains the UI components (Views) and logic (ViewModels) responsible for displaying data to the user.
- **Domain Layer**: Defines the core business logic and use cases of the application.
- **Data Layer**: Responsible for data management, including making network requests to the Unsplash API, and returning data to the domain layer via repositories.

## API Integration

The app integrates with the **Unsplash API** to fetch images. The API provides a wide range of high-quality images that are displayed in the app. The app uses **Ktor** to handle the HTTP requests and fetch data from the backend.

## Platforms Supported

- **Android**: Native Android app built using Jetpack Compose.
- **iOS**: Native iOS app that shares business logic and data handling with the Android version.
- **Desktop**: A cross-platform desktop version using Kotlin Multiplatform.

## How to run

- **Desktop** In terminal write the command ** ./gradlew run **
- **Android** Simply run the composeApp from android studio on the selected android device.
- **IOS** First configure the xCode and download the simulators, in android studio set the configurations by providing the path of osApp.xcodeproj and choose iosApp from apps and run on the selected simulator.

## Contribution

Contributions are welcome! Feel free to fork the repository, open issues, or submit pull requests. Please follow the contribution guidelines and ensure your changes adhere to the project structure.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.


**Malik Hamza**