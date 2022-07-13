import { TestBed } from '@angular/core/testing';

import { DressArrayService } from './dress-array.service';

describe('DressArrayService', () => {
  let service: DressArrayService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DressArrayService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
