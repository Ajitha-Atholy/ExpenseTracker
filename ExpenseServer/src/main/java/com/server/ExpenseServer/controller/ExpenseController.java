package com.server.ExpenseServer.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.server.ExpenseServer.model.Expense;
import com.server.ExpenseServer.model.Response;
import com.server.ExpenseServer.service.ExpenseService;

@RestController
@RequestMapping("/api/")
@CrossOrigin
public class ExpenseController {

    @Autowired
    ExpenseService service;
    
    @PostMapping("/CreateExpense")
    public ResponseEntity<?> CreateExpense(@RequestBody Expense expenseData)throws Exception{
        try{
            boolean ok=service.CreateExpense(expenseData);
            Response res;
            if(ok){
                res=new Response(true, "Successfully stored Expense data");

            }else{
                res=new Response(true, "couldnt store Expense data");
            }
            return ResponseEntity.ok(res);
        }catch(Exception error){
            throw error;
        }
    }

    @GetMapping("/GetExpenses")
    public ResponseEntity<Response> GetExpenses() throws Exception{
        try{
        
            Response res= new Response(true, "Successfully fetched Expense datas",service.GetExpenses());
            return ResponseEntity.ok(res);
        }catch(Exception e){
            throw e;
        }
    }

    @GetMapping("/ReadExpense")
    public ResponseEntity<Response> ReadExpense(int id) throws Exception{
        try{
        
            Response res= new Response(true, "Successfully fetched Expense datas",service.ReadExpense(id));
            return ResponseEntity.ok(res);
        }catch(Exception e){
            throw e;
        }
    }

}
