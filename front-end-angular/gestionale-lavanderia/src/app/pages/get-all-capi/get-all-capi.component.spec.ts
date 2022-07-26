import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetAllCapiComponent } from './get-all-capi.component';

describe('GetAllCapiComponent', () => {
  let component: GetAllCapiComponent;
  let fixture: ComponentFixture<GetAllCapiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GetAllCapiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GetAllCapiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
