import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient, HttpRequest, HttpResponse, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError, filter, map } from 'rxjs/operators';
export enum RequestMethod {
  Get = 'GET',
  Head = 'HEAD',
  Post = 'POST',
  Put = 'PUT',
  Delete = 'DELETE',
  Options = 'OPTIONS',
  Patch = 'PATCH'
}
@Injectable({
  providedIn: 'root'
})
export class ApiService {
  headers = new HttpHeaders({
    'Accept': 'application/json',
    'Content-Type': 'application/json'
  });

  constructor(private http: HttpClient) {
  }
  post(path: string, body: any, customHeaders?: HttpHeaders): Observable<any> {
    console.log('usao u apiservice post');
    console.log(path);
    
    return this.request(path, body, RequestMethod.Post, customHeaders);
  }
  get(path: string, args?: any): Observable<any> {
    const options = {
      headers: this.headers,
    };
console.log(args);
console.log(path);
    if (args) {
      options['params'] = serialize(args);
    }
console.log(options);
    return this.request(path, args,  RequestMethod.Get,  options.headers)
   // return this.http.get(path, options)
      .pipe(catchError(this.checkError.bind(this)));
  }
  private request(path: string, body: any, method = RequestMethod.Post, custemHeaders?: HttpHeaders): Observable<any> {
    console.log('usaourequest');
    console.log(path);
    
    const req = new HttpRequest(method, path, body, {
      headers: custemHeaders || this.headers, 
      reportProgress: true,
      withCredentials: true,
    });
console.log(req);

    return this.http.request(req).pipe(filter(response => response instanceof HttpResponse))
      .pipe(map((response: HttpResponse<any>) => response.body))
      .pipe(catchError(error => this.checkError(error)));
  }
  private checkError(error: any): any {
    console.log(error);
    if (error && error.status === 401) {
      // this.redirectIfUnauth(error);
      console.log('eror');
    } else {
      // this.displayError(error);
      console.log('eror');
    }
   
    console.log(error);
    
    throw error;
  }
}
export function serialize(obj: any): HttpParams {
  let params = new HttpParams();

  for (const key in obj) {
    if (obj.hasOwnProperty(key) && !looseInvalid(obj[key])) {
      params = params.set(key, obj[key]);
    }
  }

  return params;
}
export function looseInvalid(a: string | number): boolean {
  return a === '' || a === null || a === undefined;
}