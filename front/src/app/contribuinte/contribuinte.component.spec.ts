import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ContribuinteComponent } from './contribuinte.component';

describe('ContribuinteComponent', () => {
  let component: ContribuinteComponent;
  let fixture: ComponentFixture<ContribuinteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ContribuinteComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ContribuinteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
