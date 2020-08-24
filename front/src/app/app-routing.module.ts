import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SalaComponentComponent } from './components/sala-component/sala-component.component';
import { SalaFormComponent } from './components/sala-form/sala-form.component';

const routes: Routes = [
  { path: 'sale', component: SalaComponentComponent },
  { path: 'addsala', component: SalaFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
