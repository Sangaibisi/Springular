import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

export class Customer{
  constructor(
     id:number,
     firstName:string,
     lastName:string,
     email:string,
  ) {}
}

@Injectable({
  providedIn: 'root'
})
export class HttpClientService {

  constructor(
    private httpClient:HttpClient
  ) { 
     }

     getUsers()
  {
    console.log("test call");
    return this.httpClient.get<Customer[]>('http://localhost:8080/customers');
  }

  /**
   * deleteCustomer==> Works for send the id data to
   *  back-end service which user will be deleted.
   */
  public deleteCustomer(customer) {
    return this.httpClient.delete<Customer>('http://localhost:8080/customers/'+customer.id);
  }

  /**
   * createCustomer==> Works for creating a new customer
   */
  public createCustomer(customer) {
    return this.httpClient.post<Customer>('http://localhost:8080/customers',customer);
  }

  /**
   * updateCustomer
   * This method updates exist customer
   */
  public updateCustomer(customer) {
    return this.httpClient.put<Customer>('http://localhost:8080/customers',customer);
  }
}
