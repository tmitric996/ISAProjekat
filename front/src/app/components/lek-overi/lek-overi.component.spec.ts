import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LekOveriComponent } from './lek-overi.component';

describe('LekOveriComponent', () => {
  let component: LekOveriComponent;
  let fixture: ComponentFixture<LekOveriComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LekOveriComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LekOveriComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
