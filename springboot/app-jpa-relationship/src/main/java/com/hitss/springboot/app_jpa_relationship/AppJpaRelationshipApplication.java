package com.hitss.springboot.app_jpa_relationship;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.hitss.springboot.app_jpa_relationship.ENTITIES.Address;
import com.hitss.springboot.app_jpa_relationship.ENTITIES.Client;
import com.hitss.springboot.app_jpa_relationship.ENTITIES.ClientDetails;
import com.hitss.springboot.app_jpa_relationship.ENTITIES.Course;
import com.hitss.springboot.app_jpa_relationship.ENTITIES.Invoice;
import com.hitss.springboot.app_jpa_relationship.ENTITIES.Student;
import com.hitss.springboot.app_jpa_relationship.repositories.ClientDetailsRepository;
import com.hitss.springboot.app_jpa_relationship.repositories.ClientRepository;
import com.hitss.springboot.app_jpa_relationship.repositories.InvoiceRepository;
import com.hitss.springboot.app_jpa_relationship.repositories.StudentRepository;

@SpringBootApplication
public class AppJpaRelationshipApplication implements CommandLineRunner{

	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private InvoiceRepository invoiceRepository;

	@Autowired
	private ClientDetailsRepository clientDetailsRepository;

	public static void main(String[] args) {
		SpringApplication.run(AppJpaRelationshipApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Iniciando...");
		//oneToManyFindByIdClient();
		//oneToOneFindByIdClient();
	}

	@Transactional
	private void manyToMany(){
		Student student1 = new Student("Sergio", "Zuloaga");
		Student student2 = new Student("Eloy", "Sanchez");

		Course course1 = new Course("Taller de Java", "Juan Santiago");
		Course course2 = new Course("Taller de IA", "Bingo Salmoran");

		student1.setCourses(Set.of(course1, course2, course1));
		student2.setCourses(Set.of(course2));

		studentRepository.saveAll(List.of(student1, student2));
		System.out.println(student1);
		System.out.println(student2);
	}

	@Transactional
	private void oneToOneFindByIdClient(){
		Long id = 1L;
		Optional<Client> optionalClient = clientRepository.findById(id);
		optionalClient.ifPresentOrElse(c -> {
			ClientDetails clientDetails = new ClientDetails(false, 1000);
			clientDetailsRepository.save(clientDetails);
			c.setClientDetails(clientDetails);

			Client client =clientRepository.save(c);
			System.out.println(client);
		}, 
		() -> System.out.println("No existe el cliente con el id: " + id));


	}

	@Transactional
	private void manyToOne(){
		Client client = new Client("Sergio", "Zuloaga");
		clientRepository.save(client);

		Invoice invoice = new Invoice("Compras de oficina", 20000.0);
		invoice.setClient(client);
		Invoice invoiceDB = invoiceRepository.save(invoice);
		System.out.println(invoiceDB);
	}

	private void manyToOneFindByIdClient(){
		Long id = 1L;
		Optional<Client> optionalClient = clientRepository.findById(id);
		optionalClient.ifPresentOrElse(p -> {
			Invoice invoice = new Invoice("Nueva Factura 21/10/205", 2500.0);
			invoice.setClient(p);
			invoiceRepository.save(invoice);
		}, 
		() -> System.out.println("No hay un cliente con el id: " + id));
	}

	@Transactional
	private void oneToManyFindByIdClient(){
		Long id = 2L;
		Optional<Client> optionalClient = clientRepository.findById(id);

		optionalClient.ifPresentOrElse(c -> {
			Address address = new Address("Calle Hidalgo", 4);
			c.setAddresses(Arrays.asList(address));
			Client client = clientRepository.save(c);
			System.out.println(client);
		}, 
		() -> System.out.println("No existe un cliente con el id: " + id));
	}

	@Transactional
	private void oneToMany(){
		Client client = new Client("Susana", "Gonzaga");
		Address address1 = new Address("Hipodromo", 123);
		Address address2 = new Address("Independencia", 56);

		// client.getAddresses().add(address1);
		// client.getAddresses().add(address2);

		// List<Address> addresses = new ArrayList<>();
		// addresses.add(address1);
		// addresses.add(address2);
		// client.setAddresses(addresses);

		// client.setAddresses(Arrays.asList(address1, address2));
		client.setAddresses(List.of(address1, address2));

		Client clientDB = clientRepository.save(client);
		System.out.println(clientDB);
	}

}
