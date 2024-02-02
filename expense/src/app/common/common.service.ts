import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Expense } from './expense.model';

@Injectable({
  providedIn: 'root'
})
export class CommonService {

  url = 'http://localhost:4000/api'
  constructor(private httpClient: HttpClient) { }

  addExpense(data: any): Observable<Object> {
    return this.httpClient.post(`${this.url}/CreateExpense`, data)
  }
  getExpenseOfMonth(): Observable<Expense[]>{
    return this.httpClient.get<Expense[]>(`${this.url}/GetExpenses`)
  }
}
