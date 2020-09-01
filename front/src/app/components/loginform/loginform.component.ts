  
import {Component, OnDestroy, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import { User } from 'src/app/model/user';
import { ActivatedRoute, Router } from '@angular/router';
import { UserServiceService } from 'src/app/service/user-service.service';
import { AuthService } from 'src/app/service/auth.service';
import { takeUntil } from 'rxjs/operators';
import { Subject } from 'rxjs';

@Component({
  selector: 'app-loginform',
  templateUrl: './loginform.component.html',
  styleUrls: ['./loginform.component.css']
})
export class LoginformComponent {
  //returnUrl: string;
  //form: FormGroup;
  user:  User;
  //notification:{msgType: string;
  //  msgBody: string;}
  //credentials = {email: '', password: ''};
  constructor(   
    private authService: AuthService,
    private router: Router,
   // private route: ActivatedRoute,
   // private formBuilder: FormBuilder,
      private userService: UserServiceService) {
  this.user = new User();
 }

 onSubmit() {
  this.authService.login(this.user)
      .subscribe(data => {
        this.goToPacijentList();
        //  this.userService.getMyInfo().subscribe();
        //  this.router.navigate([this.returnUrl]);
        },
        error => {
          
        //  this.notification = {msgType: 'error', msgBody: 'Incorrect username or password.'};
        });

 }
 goToPacijentList(){
  this.router.navigate(['/pacijenti']);
}
 private ngUnsubscribe: Subject<void> = new Subject<void>();

  /*ngOnInit(): void {
    this.route.params
      .pipe(takeUntil(this.ngUnsubscribe))
      .subscribe((params: {msgType: string;
        msgBody: string;}) => {
        this.notification = params;
      });
    // get return url from route parameters or default to '/'
    this.returnUrl = this.route.snapshot.queryParams['returnUrl'] || '/';
    this.form = this.formBuilder.group({
      email: ['', Validators.compose([Validators.required, Validators.minLength(3), Validators.maxLength(64)])],
      password: ['', Validators.compose([Validators.required, Validators.minLength(3), Validators.maxLength(32)])]
    });
  }*/

}
