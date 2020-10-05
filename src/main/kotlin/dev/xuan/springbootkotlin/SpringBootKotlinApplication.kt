package dev.xuan.springbootkotlin

import dev.xuan.springbootkotlin.domain.Person
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class SpringBootKotlinApplication {

	@GetMapping
	fun index(): Person  {
		return Person(name = "Argyn", lastName = "Khuan")
	}

}

fun main(args: Array<String>) {
	runApplication<SpringBootKotlinApplication>(*args)
}
