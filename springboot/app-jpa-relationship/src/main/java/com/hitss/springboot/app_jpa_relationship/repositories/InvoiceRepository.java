package com.hitss.springboot.app_jpa_relationship.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hitss.springboot.app_jpa_relationship.ENTITIES.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long>{

}
