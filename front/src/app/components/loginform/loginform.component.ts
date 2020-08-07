import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/model/user';
import { ActivatedRoute, Router } from '@angular/router';
import { UserServiceService } from 'src/app/service/user-service.service';

@Component({
  selector: 'app-loginform',
  templateUrl: './loginform.component.html',
  styleUrls: ['./loginform.component.css']
})
export class LoginformComponent implements OnInit {

  user: User;
  constructor(private route: ActivatedRoute, 
    private router: Router, 
      private userService: UserServiceService) {
  this.user = new User();
  } 

  ngOnInit(): void {
  }

}
