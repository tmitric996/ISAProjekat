import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SalaComponentComponent } from './components/sala-component/sala-component.component';
import { SalaServiceService } from './service/sala-service.service';
import { SalaFormComponent } from './components/sala-form/sala-form.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { LoginformComponent } from './components/loginform/loginform.component';
import { RegisterformComponent } from './components/registerform/registerform.component';
import { UserServiceService } from './service/user-service.service';
import { PacijentService } from './service/pacijent.service';
import { PacijentiListComponent } from './components/pacijenti-list/pacijenti-list.component';
@NgModule({
  declarations: [
    AppComponent,
    SalaComponentComponent,
    SalaFormComponent,
    LoginformComponent,
    RegisterformComponent,
    PacijentiListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [
    UserServiceService,
    SalaServiceService,
    PacijentService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
