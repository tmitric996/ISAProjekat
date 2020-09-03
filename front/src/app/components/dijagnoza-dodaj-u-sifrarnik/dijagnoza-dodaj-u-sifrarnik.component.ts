import { Component, OnInit } from '@angular/core';

import {Dijagnoza} from '../../model/dijagnoza';
import { DijagnozaService } from 'src/app/service/dijagnoza.service';

@Component({
  selector: 'app-dijagnoza-dodaj-u-sifrarnik',
  templateUrl: './dijagnoza-dodaj-u-sifrarnik.component.html',
  styleUrls: ['./dijagnoza-dodaj-u-sifrarnik.component.css']
})
export class DijagnozaDodajUSifrarnikComponent implements OnInit {

  dijagnoze: Dijagnoza[];

  constructor(private dijagnozaService: DijagnozaService) {
  }

  ngOnInit(): void {
    this.load();
  }

  load(){
    this.dijagnozaService.findAll().subscribe(data => {
      this.dijagnoze = data;
    });
  }

  dodaj(dijagnoza: Dijagnoza){
    this.dijagnozaService.dodaj(dijagnoza);
    this.load();
  }
}
