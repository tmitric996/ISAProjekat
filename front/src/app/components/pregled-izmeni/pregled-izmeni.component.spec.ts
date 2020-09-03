import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PregledIzmeniComponent } from './pregled-izmeni.component';

describe('PregledIzmeniComponent', () => {
  let component: PregledIzmeniComponent;
  let fixture: ComponentFixture<PregledIzmeniComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PregledIzmeniComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PregledIzmeniComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
