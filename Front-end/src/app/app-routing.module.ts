import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddUserComponent } from './add-user/add-user.component';
import { UserComponent } from './user/user.component';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { AuthGaurdService } from './service/auth-guard.service';

const routes: Routes = [
  {path:'customerList', component: UserComponent,canActivate:[AuthGaurdService]},
  {path:'newCustomer', component:AddUserComponent,canActivate:[AuthGaurdService]},
  {path:'login', component:LoginComponent},
  {path:'logout', component: LogoutComponent,canActivate:[AuthGaurdService]},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
