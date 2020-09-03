import { async, ComponentFixture, TestBed } from '@angular/core/testing';


import { DijagnozaDodajUSifrarnikComponent } from './dijagnoza-dodaj-u-sifrarnik.component';

describe('DijagnozaDodajUSifrarnikComponent', () => {
  let component: DijagnozaDodajUSifrarnikComponent;
  let fixture: ComponentFixture<DijagnozaDodajUSifrarnikComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DijagnozaDodajUSifrarnikComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DijagnozaDodajUSifrarnikComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
