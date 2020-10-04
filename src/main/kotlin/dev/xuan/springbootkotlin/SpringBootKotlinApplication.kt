package dev.xuan.springbootkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class SpringBootKotlinApplication {

	@GetMapping
	fun index(): String  {
		return "Hello !"
	}
}

fun main(args: Array<String>) {
	runApplication<SpringBootKotlinApplication>(*args)
}
