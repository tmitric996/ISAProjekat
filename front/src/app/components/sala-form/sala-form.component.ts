import { Component, OnInit } from '@angular/core';
import { Sala } from 'src/app/model/sala';
import { ActivatedRoute, Router } from '@angular/router';
import { SalaServiceService } from 'src/app/service/sala-service.service';

@Component({
  selector: 'app-sala-form',
  templateUrl: './sala-form.component.html',
  styleUrls: ['./sala-form.component.css']
})
export class SalaFormComponent implements OnInit {

  sala: Sala;

  constructor(private route: ActivatedRoute, 
    private router: Router, private salaService: SalaServiceService) { 
      this.sala = new Sala();
    }

  onSubmit(){
    this.salaService.save(this.sala).subscribe(result => this.gotoSalaList());
  }
  gotoSalaList(){
    this.router.navigate(['/sale'])
  }
  ngOnInit(): void {
  }

}
