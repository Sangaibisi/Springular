import { Component, OnInit } from '@angular/core';
import { CustomerService } from 'src/app/service/customer.service';
import { NgForm } from '@angular/forms';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {

  constructor(
    private service: CustomerService,
    private toastr:ToastrService
    ) { }

  ngOnInit() {
    this.resetForm();
  }

  resetForm(form?: NgForm) {
    if (form != null)
      form.resetForm();
    this.service.formData = {
      id: null,
      firstName: '',
      lastName: '',
      email: ''
    }
  }

  onSubmit(form:NgForm){
    if(form.value.id==null)
      this.insertRecord(form);
    else
      this.updateRecord(form)
  }

  insertRecord(form:NgForm){
    this.service.createCustomer(form.value).subscribe(res=>{
      this.resetForm(form);
      this.toastr.success('New customer has been created succesfuly!','Customer Register');
      this.service.customerList();
    });
  }

  updateRecord(form:NgForm){
    this.service.updateCustomer(form.value).subscribe(res=>{
      this.resetForm(form);
      this.toastr.info('The customer has been updated succesfuly!','Customer Register');
      this.service.customerList();
    });
  }
}
