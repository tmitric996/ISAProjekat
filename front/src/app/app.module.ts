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
@NgModule({
  declarations: [
    AppComponent,
    SalaComponentComponent,
    SalaFormComponent,
    LoginformComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [SalaServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
