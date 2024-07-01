import {Component, inject} from '@angular/core';
import {HttpClient, HttpClientModule} from "@angular/common/http";
import {ActivatedRoute, Router} from "@angular/router";
import {CommonModule} from "@angular/common";

@Component({
  selector: 'app-country-language',
  standalone: true,
  imports: [CommonModule,HttpClientModule],
  templateUrl: './country-language.component.html',
  styleUrl: './country-language.component.css'
})
export class CountryLanguageComponent {
  countryId: any;
  languages: any=[];
  country: any;
  constructor( private route: ActivatedRoute, private httpClient: HttpClient) { }

  ngOnInit(): void{

    this.route.paramMap.subscribe(params => {
      this.countryId = params.get('id');
    });

    this.fetchData(this.countryId);
    this.fetchCountry(this.countryId);

  }

  fetchData(countryId : string){
    this.httpClient
      .get(`http://localhost:8080/api/languages/${countryId}`)
      .subscribe({
        next: (data) => {
          this.languages = data;
        },
        error: (err) => {
        }
      })
  }

  fetchCountry(countryId : string){
    this.httpClient
      .get(`http://localhost:8080/api/country/${countryId}`)
      .subscribe({
        next: (data) => {
          this.country = data;
        },
        error: (err) => {
        }
      })
  }

}
