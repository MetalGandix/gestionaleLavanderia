import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsegnaCapiComponent } from './consegna-capi.component';

describe('ConsegnaCapiComponent', () => {
  let component: ConsegnaCapiComponent;
  let fixture: ComponentFixture<ConsegnaCapiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConsegnaCapiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConsegnaCapiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
