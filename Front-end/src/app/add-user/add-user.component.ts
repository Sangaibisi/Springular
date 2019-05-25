import { Component, OnInit } from '@angular/core';
import { HttpClientService, Customer } from '../service/http-client.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})
export class AddUserComponent implements OnInit {

  customer: Customer = new Customer(0,"","","");

  constructor(
    private httpClientService:HttpClientService,
    private _router:Router
    ) { }

  ngOnInit() {
  }

  createCustomer(): void {
    this.httpClientService.createCustomer(this.customer)
        .subscribe( data => {
          alert("Customer created successfully.");
          this._router.navigate(['customerList']);
        });
  };
}
