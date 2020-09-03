import { Component, OnInit } from '@angular/core';
import {UserServiceService} from '../../service/user-service.service';

import {User} from '../../model/user';
import {AdminklinikeService} from '../../service/adminklinike.service';

@Component({
  selector: 'app-admin-prihvati-odbij',
  templateUrl: './admin-prihvati-odbij.component.html',
  styleUrls: ['./admin-prihvati-odbij.component.css']
})
export class AdminPrihvatiOdbijComponent implements OnInit {
  useri: User[];

  constructor(private userService: UserServiceService,
              private adminKlinikeService: AdminklinikeService) {  }

  ngOnInit() {
    this.load();
  }

  load(){
    this.userService.findAll().subscribe(data => {
      this.useri = data;
    });
  }

  prihvati(id: string) {
    this.adminKlinikeService.prihvati(id);
    this.load();
    console.log("Prihvati:" + id);
  }

  odbij(id: string) {
    this.adminKlinikeService.odbij(id);
    this.load();
    console.log("Odbij:" + id);
  }

}
