import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LekDodajUSifrarnikComponent } from './lek-dodaj-u-sifrarnik.component';

describe('LekDodajUSifrarnikComponent', () => {
  let component: LekDodajUSifrarnikComponent;
  let fixture: ComponentFixture<LekDodajUSifrarnikComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LekDodajUSifrarnikComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LekDodajUSifrarnikComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
