import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {GodisnjiOdmor} from '../model/godisnji-odmor';
import {Observable} from 'rxjs';
import {User} from '../model/user';

@Injectable({
  providedIn: 'root'
})
export class GodisnjiOdmorService {

  godisnjiOdmorUrl: string;

  constructor(private http: HttpClient) {
   this.godisnjiOdmorUrl = 'localhost:8080/gododmor';
  }

  public findAll(): Observable<GodisnjiOdmor[]> {
    return this.http.get<GodisnjiOdmor[]>(this.godisnjiOdmorUrl);
  }

  dodaj(godisnjiOdmor: GodisnjiOdmor){

  }
}
