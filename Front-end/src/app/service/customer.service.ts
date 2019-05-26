import { Injectable } from '@angular/core';
import { Customer } from './customer.model';
import { HttpClient } from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  formData:Customer;

  readonly rootURL="http://localhost:8080";
  constructor(private httpClient: HttpClient) { }
  
  /**
   * customerList==> It's a get method for
   * fetch the all customer data from back-end service.
   */
  public customerList()
  {
    return this.httpClient.get<Customer[]>('http://localhost:8080/customers');
  }

  /**
   * deleteCustomer==> Works for send the id data to
   *  back-end service which user will be deleted.
   */
  public deleteCustomer(formData: Customer) {
    return this.httpClient.delete<Customer>('http://localhost:8080/customers/'+formData.id);
  }

  /**
   * createCustomer==> Works for creating a new customer
   */
  public createCustomer(formData: Customer) {
    return this.httpClient.post('http://localhost:8080/customers',formData);
  }

  /**
   * updateCustomer
   * This method updates exist customer
   */
  public updateCustomer(formData: Customer) {
    return this.httpClient.put<Customer>('http://localhost:8080/customers',formData);
  }
}
