package dev.xuan.springbootkotlin.resource

import dev.xuan.springbootkotlin.dto.AddPersonRequest
import dev.xuan.springbootkotlin.dto.PersonResponse
import dev.xuan.springbootkotlin.dto.UpdatePersonRequest
import org.springframework.http.ResponseEntity

class PersonResourceImpl : PersonResource {
    override fun findById(id: Long): ResponseEntity<PersonResponse?> {
        TODO("Not yet implemented")
    }

    override fun findAll(): ResponseEntity<List<PersonResponse>> {
        TODO("Not yet implemented")
    }

    override fun save(addPersonRequest: AddPersonRequest): ResponseEntity<PersonResponse> {
        TODO("Not yet implemented")
    }

    override fun update(updatePersonRequest: UpdatePersonRequest): ResponseEntity<PersonResponse> {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: Long): ResponseEntity<Unit> {
        TODO("Not yet implemented")
    }

    companion object {
        const val BASE_PERSON_URL: String = "api/v1/person"
    }
}