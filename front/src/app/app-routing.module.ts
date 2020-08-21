import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginformComponent } from './components/loginform/loginform.component';
import { RegisterformComponent } from './components/registerform/registerform.component';
import { PacijentiListComponent } from './components/pacijenti-list/pacijenti-list.component';

const routes: Routes = [
  { path: '', redirectTo: 'pacijenti', pathMatch:'full' },
  { path: 'pacijenti', component: PacijentiListComponent},
  { path: 'loginform', component: LoginformComponent },
  { path: 'register', component: RegisterformComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
