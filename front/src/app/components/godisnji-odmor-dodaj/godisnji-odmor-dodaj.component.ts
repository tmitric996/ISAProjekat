import { Component, OnInit } from '@angular/core';
import {Dijagnoza} from '../../model/dijagnoza';
import {DijagnozaService} from '../../service/dijagnoza.service';
import {GodisnjiOdmor} from '../../model/godisnji-odmor';
import {GodisnjiOdmorService} from '../../service/godisnji-odmor.service';

@Component({
  selector: 'app-godisnji-odmor-dodaj',
  templateUrl: './godisnji-odmor-dodaj.component.html',
  styleUrls: ['./godisnji-odmor-dodaj.component.css']
})
export class GodisnjiOdmorDodajComponent implements OnInit {

  godisnjiOdmori: GodisnjiOdmor[];

  constructor(private godisnjiOdmorService: GodisnjiOdmorService) { }

  ngOnInit(): void {
    this.load();
  }

  load(){
    this.godisnjiOdmorService.findAll().subscribe(data => {
      this.godisnjiOdmori = data;
    });
  }

  dodaj(godisnjiOdmor: GodisnjiOdmor){
    this.godisnjiOdmorService.dodaj(godisnjiOdmor);
    this.load();
  }

}
