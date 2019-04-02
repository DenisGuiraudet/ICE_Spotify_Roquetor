import { Injectable } from '@angular/core';
import { EmployeeComponent } from "./employee.component";
import { Http, Response } from "@angular/http";
import { Headers, RequestOptions } from '@angular/http';
import 'rxjs/add/operator/toPromise';
import { HttpClient, HttpHeaders } from '@angular/common/http';
@Injectable()
export class EmployeeService {
private apiUrl = '/api/employees';
constructor(private http: Http) {
 }
findAll(): Promise<Array<EmployeeComponent>> {
 return this.http.get(this.apiUrl)
 .toPromise()
 .then(response => response.json() as EmployeeComponent[])
 .catch(this.handleError);
 }
createEmployee(employee: EmployeeComponent): Promise<Array<EmployeeComponent>> {
 let empHeaders = new Headers({ 'Content-Type': 'application/json' });
 return this.http.post(this.apiUrl, JSON.stringify(employee), { headers: empHeaders })
 .toPromise()
 .then(response => response.json() as EmployeeComponent[])
 .catch(this.handleError);
 }
deleteEmployeeById(id: number): Promise<Array<EmployeeComponent>> {
 const url = `${this.apiUrl}/${id}`;
 return this.http.delete(url)
 .toPromise()
 .then(response => response.json() as EmployeeComponent[])
 .catch(this.handleError);
 }
private handleError(error: any): Promise<Array<any>> {
 console.error('An error occurred', error);
 return Promise.reject(error.message || error);
 }
}