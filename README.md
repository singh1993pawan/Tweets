This is a native Android app built for learning purposes, showcasing the use of modern Android development tools and libraries. The app allows users to view a list of tweets fetched from a backend server (JSONBIN.io in this case) and view details of each tweet. It's built using Kotlin and leverages various Jetpack components, Jetpack Compose for UI, Hilt for dependency injection, Retrofit for network requests, and Navigation for navigating between screens. The app follows the MVVM (Model-View-ViewModel) architecture pattern for better separation of concerns and testability.

Features:
Fetches tweets from a JSON file hosted on JSONBIN.io.
Allows users to click on a category to view its details.
Provides a clean and responsive UI built with Jetpack Compose.
Utilizes Hilt for dependency injection to manage object creation and injection.
Implements Retrofit to handle network requests for fetching tweets.
Navigates between different screens using the Navigation component.


Libraries and Tools Used:
Kotlin
Jetpack Compose
Hilt for dependency injection
Retrofit for networking
Navigation component for navigation
MVVM architecture pattern
JSONBIN.io for hosting the backend JSON file