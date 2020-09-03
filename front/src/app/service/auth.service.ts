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
    //private user: User;
    private accesstoken = "";
    loginURL = 'http://localhost:8080/auth/login';
     body : {
      email: '',
      password: ''
    };

    login(user: User) : any {
      console.log('usao u login');
      console.log(user.email);
      //console.log(this.body.email)
      const loginHeaders = new HttpHeaders({
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      });
      
      //this.body.email=user.email;
      console.log('moze da dodelivrednsot');
      console.log(user);
      console.log(this.loginURL);
      
      //this.body.password=user.password;
      return this.apiService.post(this.loginURL, user, loginHeaders)
      .pipe(map((res)=>{
        console.log('Login success');
        console.log(res);
        console.log(res.accessToken)
        this.accesstoken = res.accessToken;

        
      }));
    }
  }
