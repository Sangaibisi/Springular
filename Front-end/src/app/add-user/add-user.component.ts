import { Component, OnInit } from '@angular/core';
import { HttpClientService, Customer } from '../service/http-client.service';

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})
export class AddUserComponent implements OnInit {

  customer: Customer = new Customer(0,"","","");

  constructor(
    private httpClientService:HttpClientService) { }

  ngOnInit() {
  }

  createCustomer(): void {
    this.httpClientService.createCustomer(this.customer)
        .subscribe( data => {
          alert("Customer created successfully.");
        });

  };

}
