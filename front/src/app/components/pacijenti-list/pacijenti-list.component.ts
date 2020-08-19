import { Component, OnInit } from '@angular/core';
import { Pacijent } from 'src/app/model/pacijent';
import { PacijentService } from 'src/app/service/pacijent.service';

@Component({
  selector: 'app-pacijenti-list',
  templateUrl: './pacijenti-list.component.html',
  styleUrls: ['./pacijenti-list.component.css']
})
export class PacijentiListComponent implements OnInit {
  
  pacijenti: Pacijent[];

  constructor(private pacijentService: PacijentService) { }

  ngOnInit() {
    this.pacijentService.findAll().subscribe(data => {
      this.pacijenti = data;
    });
  }

}
