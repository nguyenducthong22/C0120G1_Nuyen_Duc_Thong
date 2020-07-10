import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ConuntdouwnTimerGetSetComponent } from './conuntdouwn-timer-get-set.component';

describe('ConuntdouwnTimerGetSetComponent', () => {
  let component: ConuntdouwnTimerGetSetComponent;
  let fixture: ComponentFixture<ConuntdouwnTimerGetSetComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ConuntdouwnTimerGetSetComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ConuntdouwnTimerGetSetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
