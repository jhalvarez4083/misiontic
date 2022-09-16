package com.misiontic.practica.services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.misiontic.practica.Interfaces.TransactionInterface;
import com.misiontic.practica.entities.Transaction;
import com.misiontic.practica.repositories.TransactionRepository;

@Service

public class TransactionServices implements TransactionInterface {

    @Autowired private TransactionRepository transactionRepository;

    @Override
    public Transaction saveTransaction(Transaction transaction) {
        // TODO Auto-generated method stub
        return transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> fetchTransactionList() {
        // TODO Auto-generated method stub
        return (List<Transaction>) transactionRepository.findAll();
    }

    @Override
    public Transaction updateTransaction(Transaction transaction, Long transactionId) {
        // TODO Auto-generated method stub
        Transaction item = transactionRepository.findById(transactionId)
                .get();

        if (Objects.nonNull(transaction.getConcept())
                && !"".equalsIgnoreCase(
                        transaction.getConcept())) {
            item.setConcept(
                    transaction.getConcept());
        }
        if (Objects.nonNull(transaction.getAmount())
                && !"".equals(
                    transaction.getAmount())) {
            item.setAmount(
                transaction.getAmount());
        }

        if (Objects.nonNull(transaction.getUser())
                && !"".equalsIgnoreCase(
                    transaction.getUser())) {
            item.setUser(
                transaction.getUser());
        }

        if (Objects.nonNull(transaction.getEnterprise())
                && !"".equalsIgnoreCase(
                        transaction.getEnterprise())) {
            item.setEnterprise(
                transaction.getEnterprise());
        }
        

        
        return transactionRepository.save(item);
    }

    @Override
    public void deleteTransactionId(Long transactionId) {
        // TODO Auto-generated method stub
        transactionRepository.deleteById(transactionId);
    }

}
