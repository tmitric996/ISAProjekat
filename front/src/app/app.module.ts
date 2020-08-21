import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Injectable } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SalaComponentComponent } from './components/sala-component/sala-component.component';
import { SalaServiceService } from './service/sala-service.service';
import { SalaFormComponent } from './components/sala-form/sala-form.component';
import { HttpClientModule, HttpInterceptor, HttpRequest, HttpHandler } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { LoginformComponent } from './components/loginform/loginform.component';
import { RegisterformComponent } from './components/registerform/registerform.component';
import { UserServiceService } from './service/user-service.service';
import { PacijentService } from './service/pacijent.service';
import { AppService } from './service/app.service';
@NgModule({
  declarations: [
    AppComponent,
    SalaComponentComponent,
    SalaFormComponent,
    LoginformComponent,
    RegisterformComponent
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
    PacijentService,
    AppService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
@Injectable()
export class XhrInterceptor implements HttpInterceptor {

  intercept(req: HttpRequest<any>, next: HttpHandler) {
    const xhr = req.clone({
      headers: req.headers.set('X-Requested-With', 'XMLHttpRequest')
    });
    return next.handle(xhr);
  }
}