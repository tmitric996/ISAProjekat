import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Dijagnoza} from '../model/dijagnoza';
import {Observable} from 'rxjs';
import {User} from '../model/user';

@Injectable({
  providedIn: 'root'
})
export class DijagnozaService {

  dijagnozaUrl: string;

  constructor(private http: HttpClient) {
    this.dijagnozaUrl = 'localhost:8080/dijagnoza';
  }

  public findAll(): Observable<Dijagnoza[]> {
    return this.http.get<Dijagnoza[]>(this.dijagnozaUrl);
  }

  dodaj(dijagnoza : Dijagnoza){

  }
}
