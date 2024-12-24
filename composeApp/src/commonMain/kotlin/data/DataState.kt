package data

/**
 * A Sealed class to fetch data from server which will be either data or the error.
 * @author Malik Hamza
 */
sealed class DataState<T> {
    data class Success<T>(val data: T) : DataState<T>()
    data class Error<T>(val message: String) : DataState<T>()
}
