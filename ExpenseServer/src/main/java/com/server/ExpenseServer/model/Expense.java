package com.server.ExpenseServer.model;


// import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Expense {
    // @Id
    // private int id;
    private String expenseType;
    private String expenseAmount;
    private String date;
    
    public Expense(String expenseType, String expenseAmount, String date) {
        this.expenseType = expenseType;
        this.expenseAmount = expenseAmount;
        this.date = date;
    }
    // public Expense(int id, String expenseType, String expenseAmount, String date) {
    //     this.id = id;
    //     this.expenseType = expenseType;
    //     this.expenseAmount = expenseAmount;
    //     this.date = date;
    // }
    
    public String getExpenseType() {
        return expenseType;
    }


    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    public String getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(String expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    } 

    
}
