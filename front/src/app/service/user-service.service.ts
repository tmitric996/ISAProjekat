import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../model/user';
import { Observable } from 'rxjs';
import { ApiService } from './api.service';
import { map } from 'rxjs/operators';

@Injectable()
export class UserServiceService {
  currentUser;
  private userUrl: string;

  constructor(private http: HttpClient,
    private apiService: ApiService) { 
    this.userUrl= 'http://localhost:8080/users';
   }
   public findAll(): Observable<User[]> {
    return this.http.get<User[]>(this.userUrl);
  }
  getMyInfo() {
    return this.apiService.get('http://localhost:8080/users/whoami')
      .pipe(map(user => {
        this.currentUser = user;
        return user;
      }));
  }
}
