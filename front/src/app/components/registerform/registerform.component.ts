import { Component, OnInit } from '@angular/core';
import { Pacijent } from 'src/app/model/pacijent';
import { ActivatedRoute, Router } from '@angular/router';
import { PacijentService } from 'src/app/service/pacijent.service';

@Component({
  selector: 'app-registerform',
  templateUrl: './registerform.component.html',
  styleUrls: ['./registerform.component.css']
})
export class RegisterformComponent{

  pacijent:  Pacijent;
  constructor(private route: ActivatedRoute, 
    private router: Router, 
      private pacijentService: PacijentService) {
  this.pacijent = new Pacijent();
 }

  onSubmit() {
    this.pacijent.tipKorisnika="PACIJENT";
    this.pacijent.enabled=true;
    this.pacijentService.save(this.pacijent).subscribe(result => this.goToPacijentList());
  }

  goToPacijentList(){
    this.router.navigate(['/pacijenti']);
  }
  
}
