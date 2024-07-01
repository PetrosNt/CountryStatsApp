import {Component, inject} from '@angular/core';
import {HttpClient, HttpClientModule} from "@angular/common/http";
import {CommonModule} from "@angular/common";
import { Router } from '@angular/router';

@Component({
  selector: 'app-task1',
  standalone: true,
  imports: [CommonModule,HttpClientModule],
  templateUrl: './task1.component.html',
  styleUrl: './task1.component.css'
})
export class Task1Component {
  httpClient= inject(HttpClient);
  data: any=[];
  constructor( private router: Router) { }

  ngOnInit(): void{
    this.fetchData();
  }

  fetchData(){
    this.httpClient
      .get('http://localhost:8080/api/countries')
      .subscribe((response: any)=>{
        this.data=response;
      })
  }

  onRowClick(country: any): void {
    // Navigate to a URL based on the item's data
    this.router.navigate([`/countrylanguage`,country.id]);
  }
}
