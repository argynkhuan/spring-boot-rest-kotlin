package dev.xuan.springbootkotlin.service

import dev.xuan.springbootkotlin.dto.AddPersonRequest
import dev.xuan.springbootkotlin.dto.PersonResponse
import dev.xuan.springbootkotlin.dto.UpdatePersonRequest

interface PersonManagementService {

    fun findById(id: Long): PersonResponse?
    fun findAll(): List<PersonResponse>
    fun save(addPersonRequest: AddPersonRequest): PersonResponse
    fun update(updatePersonRequest: UpdatePersonRequest): PersonResponse
    fun deleteById(id: Long)

}