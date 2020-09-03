import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PredefAdminkcDodajAdminakcComponent } from './predef-adminkc-dodaj-adminakc.component';

describe('PredefAdminkcDodajAdminakcComponent', () => {
  let component: PredefAdminkcDodajAdminakcComponent;
  let fixture: ComponentFixture<PredefAdminkcDodajAdminakcComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PredefAdminkcDodajAdminakcComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PredefAdminkcDodajAdminakcComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
