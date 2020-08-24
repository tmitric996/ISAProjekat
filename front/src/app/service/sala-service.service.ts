import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders  } from '@angular/common/http';
import { Sala } from '../model/sala';
import { Observable } from 'rxjs';

@Injectable(
)
export class SalaServiceService {

  private salaUrl: string;
  private salaUrlId: string;

  constructor(private http: HttpClient) {
    this.salaUrl = 'http://localhost:8080/sala';
    this.salaUrlId = 'http://localhost:8080/sala/{id}';
   }

   public findAll(): Observable<Sala[]> {
     return this.http.get<Sala[]>(this.salaUrl);
   }

   public save(sala: Sala){
     return this.http.post<Sala>(this.salaUrl, sala);
   }

   public delete(sala: Sala){
     return this.http.delete<Sala>(this.salaUrlId)
   }
}
