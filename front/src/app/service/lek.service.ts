import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Lek} from '../model/lek';
import {Observable} from 'rxjs';
import {User} from '../model/user';

@Injectable({
  providedIn: 'root'
})
export class LekService {

  lekUrl: string;

  constructor(private http: HttpClient) {
    this.lekUrl = 'localhost:8080/lek';
  }

  public findAll(): Observable<Lek[]> {
    return this.http.get<Lek[]>(this.lekUrl);
  }

  dodaj(lek: Lek){

  }

  overi(id: number, idOverivaca: number){

  }
}
