package com.infy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.model.Invoice;
@Repository
public interface InvoiceRepository  extends JpaRepository<Invoice, Integer>{

}
