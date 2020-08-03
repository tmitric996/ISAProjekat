import { Component, OnInit } from '@angular/core';
import { SalaServiceService } from 'src/app/service/sala-service.service';
import { Sala } from 'src/app/model/sala';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-sala-list',
  templateUrl: './sala-component.component.html',
  styleUrls: ['./sala-component.component.css']
})
export class SalaComponentComponent implements OnInit {

  sale: Sala[];

  constructor(private salaService: SalaServiceService) { 
    }

  ngOnInit(): void {
    this.salaService.findAll().subscribe(data => {
      this.sale = data;
    });
  }

}
