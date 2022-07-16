import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MostraCapiComponent } from './mostra-capi.component';

describe('MostraCapiComponent', () => {
  let component: MostraCapiComponent;
  let fixture: ComponentFixture<MostraCapiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MostraCapiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MostraCapiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
