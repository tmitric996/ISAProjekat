import { Component, OnInit } from '@angular/core';
import {Pregled} from '../../model/pregled';
import {PregledService} from '../../service/pregled.service';

@Component({
  selector: 'app-pregled-izmeni',
  templateUrl: './pregled-izmeni.component.html',
  styleUrls: ['./pregled-izmeni.component.css']
})
export class PregledIzmeniComponent implements OnInit {

  pregledi: Pregled[];

  constructor(private pregledService: PregledService) { }

  load(){
    this.pregledService.findAll().subscribe(data => {
      this.pregledi = data;
    });
  }
  ngOnInit(): void {
    this.load();
  }

  izmeni(izvestaj: string, id: number){
    this.pregledService.izmeni(izvestaj, id);
    this.load();
  }

}
