package com.infy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.model.InvoiceStatus;
@Repository
public interface InvoiceStatusRepository  extends JpaRepository<InvoiceStatus, Integer>{

}
