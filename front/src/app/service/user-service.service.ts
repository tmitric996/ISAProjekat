import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../model/user';
import { Observable } from 'rxjs';
import { ApiService } from './api.service';
import { map } from 'rxjs/operators';

@Injectable()
export class UserServiceService {
  currentUser: User;
  private userUrl: string;

  constructor(private http: HttpClient,
    private apiService: ApiService) { 
    this.userUrl= 'http://localhost:8080/users';
   }
   public findAll(): Observable<User[]> {
    return this.http.get<User[]>(this.userUrl);
  }
  public getMyInfo(email: string) : Observable<any>{
    console.log(email);
    
      const headers = new HttpHeaders({'Content-Type': 'application/json'});
      return this.http.post(`${this.userUrl}/{email}`,email, {headers});
    
    //return this.apiService.get('http://localhost:8080/users/{email}', email );
      //.pipe(map(user => {
      //  this.currentUser = user;
     //   return user;
    //  }));
  }
}
