import { TestBed } from '@angular/core/testing';

import { AdminklinikeService } from './adminklinike.service';

describe('AdminklinikeService', () => {
  let service: AdminklinikeService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AdminklinikeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
