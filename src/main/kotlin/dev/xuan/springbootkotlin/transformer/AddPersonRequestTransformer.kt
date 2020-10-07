package dev.xuan.springbootkotlin.transformer

import dev.xuan.springbootkotlin.domain.Person
import dev.xuan.springbootkotlin.dto.AddPersonRequest
import org.springframework.stereotype.Component

@Component
class AddPersonRequestTransformer: Transformer<AddPersonRequest, Person> {
    override fun transformer(source: AddPersonRequest): Person {
        return Person (
                name = source.name,
                lastName = source.lastName
        )
    }
}