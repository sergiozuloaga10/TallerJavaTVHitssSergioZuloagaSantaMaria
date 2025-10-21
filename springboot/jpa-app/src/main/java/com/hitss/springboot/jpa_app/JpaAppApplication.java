package com.hitss.springboot.jpa_app;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mapping.PersistentProperty;
import org.springframework.transaction.annotation.Transactional;

import com.hitss.springboot.jpa_app.models.Person;
import com.hitss.springboot.jpa_app.repositories.PersonRepository;



@SpringBootApplication
public class JpaAppApplication implements CommandLineRunner {

	@Autowired
	private PersonRepository repository; 
	public static void main(String[] args) {
		SpringApplication.run(JpaAppApplication.class, args);
	}

	@Override
	public void run(String... args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Spring Boot");
	}

	private void create(){
		Person person = new Person();
		Person personNew = repository.save(person);
		System.out.println(personNew);
	}

	@Transactional
	private void deleteById(){
		Long id = 6L;
		System.out.println("Antes de eliminar el id: "+ id);
		repository.findAll().forEach(System.out::println);
		repository.deleteById(null);
		System.out.println("Despues de eliminar el id: "+ id);
		repository.findAll().forEach(System.out::println);
	}

	private void delete(){
		Long id = 7L;
		Optional<Person> optionalPerson = repository.findById(id);
		System.out.println("Antes de eliminar el id: "+ id);
		repository.findAll().forEach(System.out::println);

		optionalPerson.ifPresentOrElse(
			p -> {
				repository.delete(p);
				System.out.println("Despues de eliminar el id: "+ id);
				repository.findAll().forEach(System.out::println);
			},
			() -> System.out.println("La persona con el id: " + id + " no existe"));
	}

	@Transactional(readOnly = true)
	private void findAll(){
		
	}

	@Transactional
	private void update(){
		Long id = 2L;
		Optional<Person> optionalPerson = repository.findById(id);
		optionalPerson.ifPresentOrElse(
			p -> {
				repository.save(new Person(id, "Armando", "Gonzalez", "Java"));
			}, 
			() -> System.out.println("La persona con el id: " + id + " no existe"));
	}

}
