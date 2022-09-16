package com.misiontic.practica.Interfaces;

import java.util.List;

import com.misiontic.practica.entities.Transaction;



public interface TransactionInterface {
    // Save operation
    Transaction saveTransaction(Transaction transaction);
 
    // Read operation
    List<Transaction> fetchTransactionList();
 
    // Update operation
    Transaction updateTransaction(Transaction etransaction,
                                Long transactionId);
 
    // Delete operation
    void deleteTransactionId(Long transactionId);
}
