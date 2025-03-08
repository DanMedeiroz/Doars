import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ContribuinteComponent } from './contribuinte/contribuinte.component';
import { LoginComponent} from "./login/login.component";

export const routes: Routes = [
  { path: '', component: HomeComponent }, 
  { path: 'contribuinte', component: ContribuinteComponent }, 
  { path: 'login', component:LoginComponent}
];