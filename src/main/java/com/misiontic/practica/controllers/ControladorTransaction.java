package com.misiontic.practica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.misiontic.practica.entities.Transaction;
import com.misiontic.practica.services.TransactionServices;

@RestController
public class ControladorTransaction {
	@Autowired private TransactionServices transactionServices;

	@PostMapping("/transactions")
	public Transaction saveTransaction(
			@Validated @RequestBody Transaction transaction) {
		return transactionServices.saveTransaction(transaction);
	}

	@GetMapping("/transactions")
	public List<Transaction> fetchTransactiontList() {
		return transactionServices.fetchTransactionList();
	}

 
	// Update operation
	@PutMapping("/transactions/{id}")
	public Transaction updateTransaction(@RequestBody Transaction transaction,
			@PathVariable("id") Long transactionId) {
		return transactionServices.updateTransaction(
            transaction, transactionId);
	}

	// Delete operation
	@DeleteMapping("/transactions/{id}")
	public String deleteId(@PathVariable("id") Long transactionId) {
		transactionServices.deleteTransactionId(
            transactionId);
		return "Deleted Successfully";
	}
}