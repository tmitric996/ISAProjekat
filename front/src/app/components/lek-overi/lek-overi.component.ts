import { Component, OnInit } from '@angular/core';
import {Lek} from '../../model/lek';
import {LekService} from '../../service/lek.service';

@Component({
  selector: 'app-lek-overi',
  templateUrl: './lek-overi.component.html',
  styleUrls: ['./lek-overi.component.css']
})
export class LekOveriComponent implements OnInit {

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

  dodaj(id: number, idOverivaca: number){
    this.lekService.overi(id, idOverivaca);
    this.load();
  }

}
