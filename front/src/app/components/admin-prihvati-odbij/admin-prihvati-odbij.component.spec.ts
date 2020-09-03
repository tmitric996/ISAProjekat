import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminPrihvatiOdbijComponent } from './admin-prihvati-odbij.component';

describe('AdminPrihvatiOdbijComponent', () => {
  let component: AdminPrihvatiOdbijComponent;
  let fixture: ComponentFixture<AdminPrihvatiOdbijComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminPrihvatiOdbijComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminPrihvatiOdbijComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
