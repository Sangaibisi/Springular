import { Component, OnInit } from '@angular/core';
import { HttpClientService, Customer } from '../service/http-client.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  customers: string[];

  constructor(
    private httpClientService: HttpClientService
  ) { }

  ngOnInit() {
    this.httpClientService.getUsers().subscribe(
      response => this.handleSuccessfulResponse(response),
    );
  }

  handleSuccessfulResponse(response) {
    this.customers = response;
  }

  deleteCustomer(customer: Customer): void {
    this.httpClientService.deleteCustomer(customer)
      .subscribe( data => {
        this.customers = this.customers.filter(u => u !== customer);
      })
  };
}
