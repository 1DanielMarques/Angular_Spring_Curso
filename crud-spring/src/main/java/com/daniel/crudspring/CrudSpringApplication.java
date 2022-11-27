package com.daniel.crudspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.daniel.crudspring.model.Course;
import com.daniel.crudspring.repository.ICourseRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}
	@Bean
	CommandLineRunner initDataBase(ICourseRepository repository){
		return args ->{
			repository.deleteAll();
			Course c = new Course();
			c.setName("Angular com Spring");
			c.setCategory("front-end");
			repository.save(c);
		};
	}

}
