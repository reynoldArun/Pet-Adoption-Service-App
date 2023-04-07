import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AllpetsComponent } from './Components/allpets/allpets.component';
import { HomeComponent } from './Components/home/home.component';
import { LoginComponent } from './Components/login/login.component';
import { RegisterComponent } from './Components/register/register.component';

const routes: Routes = [
  {path: 'home', component:HomeComponent},
  {path: '', redirectTo:'home', pathMatch: 'full'},
  {path: 'pets', component: AllpetsComponent},
  {path: 'login', component: LoginComponent},
  {path: 'register', component: RegisterComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
