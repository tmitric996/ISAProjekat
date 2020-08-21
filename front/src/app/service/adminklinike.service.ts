import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Adminklinike } from '../model/adminklinike';

@Injectable()
export class AdminklinikeService {

  adminklinikeUrl: string;

  constructor(private http: HttpClient) {
    this.adminklinikeUrl="localhost:8080/adminklinike/{id}"
   }
   
}
