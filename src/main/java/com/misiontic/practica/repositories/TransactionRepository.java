package com.misiontic.practica.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.misiontic.practica.entities.Transaction;

@Repository
public interface TransactionRepository 
    extends JpaRepository<Transaction, Long> {
}