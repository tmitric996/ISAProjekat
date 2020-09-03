import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SalaDodajComponent } from './sala-dodaj.component';

describe('SalaDodajComponent', () => {
  let component: SalaDodajComponent;
  let fixture: ComponentFixture<SalaDodajComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SalaDodajComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SalaDodajComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
