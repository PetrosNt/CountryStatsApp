import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CountryLanguageComponent } from './country-language.component';

describe('CountryLanguageComponent', () => {
  let component: CountryLanguageComponent;
  let fixture: ComponentFixture<CountryLanguageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CountryLanguageComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CountryLanguageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
