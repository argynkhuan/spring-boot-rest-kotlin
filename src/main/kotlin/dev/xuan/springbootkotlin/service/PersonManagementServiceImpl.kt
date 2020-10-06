package dev.xuan.springbootkotlin.service

import dev.xuan.springbootkotlin.dao.PersonDao
import dev.xuan.springbootkotlin.dto.AddPersonRequest
import dev.xuan.springbootkotlin.dto.PersonResponse
import dev.xuan.springbootkotlin.dto.UpdatePersonRequest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class PersonManagementServiceImpl(private val personDao: PersonDao) : PersonManagementService {
    override fun findById(id: Long): PersonResponse? {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<PersonResponse> {
        TODO("Not yet implemented")
    }

    override fun save(addPersonRequest: AddPersonRequest): PersonResponse {
        TODO("Not yet implemented")
    }

    override fun update(updatePersonRequest: UpdatePersonRequest): PersonResponse {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: Long) {
        TODO("Not yet implemented")
    }
}