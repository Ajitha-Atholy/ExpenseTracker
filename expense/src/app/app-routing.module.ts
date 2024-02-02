import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddexpenseComponent } from './module/addexpense/addexpense.component';
import { ShowdetailsComponent } from './module/showdetails/showdetails.component';
import { ModuleComponent } from './module/module.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
  {path:'', component:LoginComponent},
  {path:'module',component:ModuleComponent,
  children:[
    {path:'addExpense', component:AddexpenseComponent},
    {path:'showExpense', component:ShowdetailsComponent}
  ]}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
