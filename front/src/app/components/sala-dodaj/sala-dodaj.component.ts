import { Component, OnInit } from '@angular/core';
import {Pregled} from '../../model/pregled';
import {PregledService} from '../../service/pregled.service';
import {Sala} from '../../model/sala';
import {SalaServiceService} from '../../service/sala-service.service';

@Component({
  selector: 'app-sala-dodaj',
  templateUrl: './sala-dodaj.component.html',
  styleUrls: ['./sala-dodaj.component.css']
})
export class SalaDodajComponent implements OnInit {

  sale: Sala[];

  constructor(private salaService: SalaServiceService) { }

  load(){
    this.salaService.findAll().subscribe(data => {
      this.sale = data;
    });
  }
  ngOnInit(): void {
    this.load();
  }

  dodaj(sala: Sala){
    this.salaService.dodaj(sala);
    this.load();
  }

}
