import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Pregled} from '../model/pregled';
import {Observable} from 'rxjs';
import {User} from '../model/user';

@Injectable({
  providedIn: 'root'
})
export class PregledService {
  pregledUrl: string;

  constructor(private http: HttpClient) {
    this.pregledUrl = 'localhost:8080/pregled';
  }

  public findAll(): Observable<Pregled[]> {
    return this.http.get<Pregled[]>(this.pregledUrl);
  }

  dodaj(pregled: Pregled){

  }

  izmeni(izvestaj: string, id: number){

  }
}
