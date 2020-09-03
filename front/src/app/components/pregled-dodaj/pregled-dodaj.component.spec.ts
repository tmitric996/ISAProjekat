import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PregledDodajComponent } from './pregled-dodaj.component';

describe('PregledDodajComponent', () => {
  let component: PregledDodajComponent;
  let fixture: ComponentFixture<PregledDodajComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PregledDodajComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PregledDodajComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
