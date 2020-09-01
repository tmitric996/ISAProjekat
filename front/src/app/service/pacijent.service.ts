import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Pacijent } from '../model/pacijent';

@Injectable()
export class PacijentService {

  private pacijentUrl: string;
  private savePacijentUrl: string;
  private body: { email :string ,
  password:string,
  firstname:string,
  lastname:string,
  adress:string,
  country:string,
  jzbo:string };

  constructor(private http: HttpClient) {
    this.pacijentUrl = 'http://localhost:8080/pacijenti';
    this.savePacijentUrl = 'http://localhost:8080/auth/register';
  }

  public findAll(): Observable<Pacijent[]> {
    return this.http.get<Pacijent[]>(this.pacijentUrl);
  }
 
  public save(pacijent: Pacijent) {
    

    return this.http.post<Pacijent>(this.savePacijentUrl, pacijent);
  }
}
