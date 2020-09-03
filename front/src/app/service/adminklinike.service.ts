import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { Adminklinike } from '../model/adminklinike';
import {map} from 'rxjs/operators';

@Injectable()
export class AdminklinikeService {

  adminklinikeUrl: string;

  constructor(private http: HttpClient, private adminKlinikeService: AdminklinikeService) {
    this.adminklinikeUrl = 'localhost:8080/adminklinike/{id}';
  }

  private accessToken = null;

  public prihvati(id: string) {
    const prihvatiHeaders = new HttpHeaders({
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    });
    return this.adminKlinikeService.prihvati(id).pipe(map((res) =>
    {
        console.log('Prihvacena registracija korisnika');
        //this.accessToken = res.AccessToken;
    }));
  }

  public odbij(id: string) {


  }
}
