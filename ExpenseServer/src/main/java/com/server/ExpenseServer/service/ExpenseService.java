package com.server.ExpenseServer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.server.ExpenseServer.model.Expense;
import com.server.ExpenseServer.repository.ExpenseRepo;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {

    @Autowired
    ExpenseRepo repo;

    public boolean CreateExpense(Expense expenseData) throws Exception {
        try{
            
            repo.save(expenseData);
            return true;

        }catch(Exception e){
            throw e;
        }
    }
    
    public List<Expense> GetExpenses() throws Exception{
        try{
            return repo.findAll();
        }catch(Exception e){
            throw e;
        }
    }

    public Optional<Expense> ReadExpense(int id) throws Exception{
        try{
            return repo.findById(id);
        }catch(Exception e){
            throw e;
        }
    }
}
