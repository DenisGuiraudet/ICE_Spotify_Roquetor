import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.scss']
})
export class EmployeeComponent implements OnInit {
  id: number;
  firstName: string;
  phoneNo: number;
  email: string;
  constructor(id: number, firstName: string, phoneNo: number, email: string){
    this.id = id;
    this.firstName = firstName;
    this.phoneNo = phoneNo;
    this.email = email;
  }

  ngOnInit() {
  }

}
