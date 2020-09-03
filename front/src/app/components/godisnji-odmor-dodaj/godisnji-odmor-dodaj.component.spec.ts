import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GodisnjiOdmorDodajComponent } from './godisnji-odmor-dodaj.component';

describe('GodisnjiOdmorDodajComponent', () => {
  let component: GodisnjiOdmorDodajComponent;
  let fixture: ComponentFixture<GodisnjiOdmorDodajComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GodisnjiOdmorDodajComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GodisnjiOdmorDodajComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
