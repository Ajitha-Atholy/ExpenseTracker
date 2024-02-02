export class Expense{
    private expenseType;
    private expenseAmount;
    private date;

    constructor(expenseType: any,expenseAmount: any, date: any){
        this.expenseType=expenseType
        this.expenseAmount=expenseAmount
        this.date=date
    }
}