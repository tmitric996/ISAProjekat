import { Injectable } from '@angular/core';
import { UserServiceService } from './user-service.service';
import { Router } from '@angular/router';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import {map} from 'rxjs/operators';
import { ApiService } from './api.service';
import { User } from '../model/user';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private userService: UserServiceService,
    private router: Router,
    private apiService: ApiService) { }
    private user: User;
    private access_token = null;
    private loginURL:'http://localhost:8080/auth/login';
    private body : {
      email: string,
      password: string
    };

    login(user: User){
      const loginHeaders = new HttpHeaders({
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      });
      this.body.email=user.email;
      this.body.password=user.password;
      return this.apiService.post(this.loginURL, this.body, loginHeaders)
      .pipe(map((res)=>{
        console.log('Login success');
        this.access_token = res.AccessToken;
      }));
    }
  }
