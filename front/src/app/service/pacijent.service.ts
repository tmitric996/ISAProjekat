import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Pacijent } from '../model/pacijent';

@Injectable()
export class PacijentService {

  private pacijentUrl: string;

  constructor(private http: HttpClient) {
    this.pacijentUrl = 'http://localhost:8080/pacijenti';
  }

  public findAll(): Observable<Pacijent[]> {
    return this.http.get<Pacijent[]>(this.pacijentUrl);
  }
 
  public save(pacijent: Pacijent) {
    return this.http.post<Pacijent>(this.pacijentUrl, pacijent);
  }
}
