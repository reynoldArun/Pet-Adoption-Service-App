import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AllpetsComponent } from './allpets.component';

describe('AllpetsComponent', () => {
  let component: AllpetsComponent;
  let fixture: ComponentFixture<AllpetsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AllpetsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AllpetsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
