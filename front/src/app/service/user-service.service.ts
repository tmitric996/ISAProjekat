import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../model/user';

@Injectable()
export class UserServiceService {

  private userAdminUrl: string;

  constructor(private http: HttpClient) { 
    this.userAdminUrl= 'http://localhost8080/adminklinike/{id}';
   }
  public getById(id: Int16Array): User {
    return this.http.get<User>(this.userAdminUrl, id);
  }
}
