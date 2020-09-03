import { Component, OnInit } from '@angular/core';
import {Lek} from '../../model/lek';
import {LekService} from '../../service/lek.service';
import {Pregled} from '../../model/pregled';
import {PregledService} from '../../service/pregled.service';

@Component({
  selector: 'app-pregled-dodaj',
  templateUrl: './pregled-dodaj.component.html',
  styleUrls: ['./pregled-dodaj.component.css']
})
export class PregledDodajComponent implements OnInit {

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

  dodaj(pregled: Pregled){
    this.pregledService.dodaj(pregled);
    this.load();
  }

}
