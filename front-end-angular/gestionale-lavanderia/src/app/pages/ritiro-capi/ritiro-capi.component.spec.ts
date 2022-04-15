import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RitiroCapiComponent } from './ritiro-capi.component';

describe('RitiroCapiComponent', () => {
  let component: RitiroCapiComponent;
  let fixture: ComponentFixture<RitiroCapiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RitiroCapiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RitiroCapiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
