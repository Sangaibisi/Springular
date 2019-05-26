import { Injectable } from '@angular/core';
import { Customer } from './customer.model';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
formData:Customer;
  constructor() { }
}


