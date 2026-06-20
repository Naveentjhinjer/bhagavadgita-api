package com.technk.bhagavadgita.exception

import com.technk.bhagavadgita.model.ApiError
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {

    private val logger =
        LoggerFactory.getLogger(GlobalExceptionHandler::class.java)

    @ExceptionHandler(ResourceNotFoundException::class)
    fun handleNotFound(
        ex: ResourceNotFoundException
    ): ResponseEntity<ApiError> {

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
            .body(
                ApiError(
                    false,
                    ex.message ?: "Resource not found"
                )
            )
    }

    @ExceptionHandler(Exception::class)
    fun handleException(
        ex: Exception
    ): ResponseEntity<ApiError> {

        logger.error("Unhandled exception", ex)

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
            .body(
                ApiError(
                    false,
                    "Something went wrong"
                )
            )
    }
}
