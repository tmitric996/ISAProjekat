import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../model/user';
import { Observable } from 'rxjs';

@Injectable()
export class UserServiceService {

  private userUrl: string;

  constructor(private http: HttpClient) { 
    this.userUrl= 'http://localhost:8080/users';
   }
   public findAll(): Observable<User[]> {
    return this.http.get<User[]>(this.userUrl);
  }
}
