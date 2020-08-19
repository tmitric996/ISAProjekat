import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PacijentiListComponent } from './pacijenti-list.component';

describe('PacijentiListComponent', () => {
  let component: PacijentiListComponent;
  let fixture: ComponentFixture<PacijentiListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PacijentiListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PacijentiListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
