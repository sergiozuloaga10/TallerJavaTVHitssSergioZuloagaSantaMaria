package com.hitss.springboot.app_jpa_relationship;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.hitss.springboot.app_jpa_relationship.ENTITIES.Client;
import com.hitss.springboot.app_jpa_relationship.ENTITIES.Invoice;
import com.hitss.springboot.app_jpa_relationship.repositories.ClientRepository;
import com.hitss.springboot.app_jpa_relationship.repositories.InvoiceRepository;

@SpringBootApplication
public class AppJpaRelationshipApplication implements CommandLineRunner{

	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private InvoiceRepository invoiceRepository;

	public static void main(String[] args) {
		SpringApplication.run(AppJpaRelationshipApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Iniciando...");
		manyToOneFindByIdClient();
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

}
