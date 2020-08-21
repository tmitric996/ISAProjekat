import { Component, OnInit } from '@angular/core';
import { Pacijent } from 'src/app/model/pacijent';
import { ActivatedRoute, Router } from '@angular/router';
import { PacijentService } from 'src/app/service/pacijent.service';

@Component({
  selector: 'app-registerform',
  templateUrl: './registerform.component.html',
  styleUrls: ['./registerform.component.css']
})
export class RegisterformComponent implements OnInit {

  pacijent:  Pacijent;
  constructor(private route: ActivatedRoute, 
    private router: Router, 
      private pacijentService: PacijentService) {
  this.pacijent = new Pacijent();
 }
  ngOnInit(): void {
  }
  onSubmit() {
    this.pacijent.tipKorisnika="PACIJENT";
    this.pacijentService.save(this.pacijent).subscribe();
  }
  
}
