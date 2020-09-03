import { Component, OnInit } from '@angular/core';
import {Lek} from '../../model/lek';
import { LekService } from 'src/app/service/lek.service';


@Component({
  selector: 'app-lek-dodaj-u-sifrarnik',
  templateUrl: './lek-dodaj-u-sifrarnik.component.html',
  styleUrls: ['./lek-dodaj-u-sifrarnik.component.css']
})
export class LekDodajUSifrarnikComponent implements OnInit {

  lekovi: Lek[];

  constructor(private lekService: LekService) { }

  load(){
    this.lekService.findAll().subscribe(data => {
      this.lekovi = data;
    });
  }
  ngOnInit(): void {
    this.load();
  }

  dodaj(lek: Lek){
    this.lekService.dodaj(lek);
    this.load();
  }

}
