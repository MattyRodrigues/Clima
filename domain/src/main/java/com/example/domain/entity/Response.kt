package com.example.domain.entity

sealed class Response<T>
class EmptyResponse<T>(val error: String) : Response<T>()
data class SuccessResponse<T>(val body: T) : Response<T>()
data class ErrorResponse<T>(val error: String) : Response<T>()