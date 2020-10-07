package dev.xuan.springbootkotlin.transformer

import dev.xuan.springbootkotlin.domain.Person
import dev.xuan.springbootkotlin.dto.PersonResponse

fun Person?.toPersonResponse(): PersonResponse {
    return PersonResponse(
            id = this?.id ?: 1L,
            fullName = "${this?.lastName}, ${this?.name}"
    )
}