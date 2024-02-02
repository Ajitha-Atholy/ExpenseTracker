package com.server.ExpenseServer.repository;

import org.springframework.stereotype.Repository;

import com.server.ExpenseServer.model.Expense;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface ExpenseRepo extends MongoRepository<Expense,Integer> {
    
}
