package dev.xuan.springbootkotlin.dto

data class AddPersonRequest(val name: String, val lastName: String? = null)