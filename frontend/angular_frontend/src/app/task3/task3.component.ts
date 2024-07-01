import {Component, inject, NgModule} from '@angular/core';
import {CommonModule, NgForOf} from "@angular/common";
import {HttpClient, HttpClientModule, HttpParams} from "@angular/common/http";
import {FormsModule} from "@angular/forms";
import { Observable } from 'rxjs';

interface Region {
  name: string;
}

@Component({
  selector: 'app-task3',
  standalone: true,
  imports: [
    CommonModule, HttpClientModule, FormsModule
  ],
  templateUrl: './task3.component.html',
  styleUrl: './task3.component.css'
})
export class Task3Component {
  httpClient= inject(HttpClient);
  data: any = [];
  region: any;
  yearFrom: any;
  yearTo: any;
  regions: any = [];


  ngOnInit(): void{
    this.fetchData();
    this.fetchRegions()
  }

  fetchData(){
    let params = new HttpParams();
    if(this.region) params = params.append('regionName',this.region);
    if(this.yearFrom) params = params.append('yearFrom',this.yearFrom);
    if(this.yearTo) params = params.append('yearTo',this.yearTo);
    this.httpClient
      .get<any[]>('http://localhost:8080/api/task3Data', {params} )
      .subscribe((data: any)=>{
        this.data=data;
      })
  }


  fetchRegions() {
    this.httpClient
      .get<Region[]>('http://localhost:8080/api/regions')
      .subscribe((response) => {
        this.regions = response.map(item => item.name);
      })
  }
}
