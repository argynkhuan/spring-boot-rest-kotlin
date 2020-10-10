package dev.xuan.springbootkotlin.resource

import dev.xuan.springbootkotlin.dto.ErrorResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import java.lang.IllegalStateException

@ControllerAdvice
class ErrorHandlerResource {

    @ExceptionHandler(IllegalStateException::class)
    fun handleIllegalState(ex: IllegalStateException): ResponseEntity<ErrorResponse> {
        return ResponseEntity.badRequest().body(ErrorResponse(message = ex.localizedMessage))
    }
}