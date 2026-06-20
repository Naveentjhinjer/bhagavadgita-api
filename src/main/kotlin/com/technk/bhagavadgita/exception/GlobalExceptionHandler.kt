package com.technk.bhagavadgita.exception

import com.technk.bhagavadgita.model.ApiError
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException::class)
    fun handleNotFound(
        ex: ResourceNotFoundException
    ): ResponseEntity<ApiError> {

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
            .body(
                ApiError(
                    success = false,
                    message = ex.message ?: "Not Found"
                )
            )
    }

    @ExceptionHandler(Exception::class)
    fun handleException(
        ex: Exception
    ): ResponseEntity<ApiError> {

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
            .body(
                ApiError(
                    success = false,
                    message = ex.message ?: "Internal Server Error"
                )
            )
    }
}
