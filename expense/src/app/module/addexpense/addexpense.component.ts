import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CommonService } from '../../common/common.service';

@Component({
  selector: 'app-addexpense',
  templateUrl: './addexpense.component.html',
  styleUrls: ['./addexpense.component.css']
})
export class AddexpenseComponent implements OnInit {
  expenseTypes = ['Travel', 'Food', 'Electricity', 'Internet', 'Cloths', 'Other'];
  addExpenseForm: FormGroup;
  success:string
  constructor(private fb: FormBuilder, private comService: CommonService) { }

  ngOnInit() {
    this.addExpenseForm = this.fb.group({
      expenseType: ['', [Validators.required]],
      expenseAmount: ['', [Validators.required]],
      date:['',[Validators.required]]
    })
  }

  addExpense() {
    this.comService.addExpense(this.addExpenseForm.value).subscribe(
      response=>{
        this.success=JSON.parse(JSON.stringify(response)).message;
      }
    )
    this.addExpenseForm.reset();
  }
}
