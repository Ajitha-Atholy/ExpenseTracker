package com.server.ExpenseServer.model;
import java.util.List;
import java.util.Optional;

public class Response {
    public boolean success;
    public String message;
    public Optional<Expense> data;
    public List<Expense> datas;
    
    public Response(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public Response(boolean success, String message, Optional<Expense> data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public Response(boolean success, String message, List<Expense> datas) {
        this.success = success;
        this.message = message;
        this.datas = datas;
    }

    
}
