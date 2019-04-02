import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { EmployeeComponent } from './employee.component';

@NgModule({
  declarations: [EmployeeListComponent, EmployeeComponent],
  imports: [
    CommonModule
  ]
})
export class EmployeeModule { }
