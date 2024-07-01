import {Component, inject} from '@angular/core';
import {CommonModule} from "@angular/common";
import {HttpClient, HttpClientModule} from "@angular/common/http";

@Component({
  selector: 'app-task2',
  standalone: true,
  imports: [CommonModule,HttpClientModule],
  templateUrl: './task2.component.html',
  styleUrl: './task2.component.css'
})
export class Task2Component {
    httpClient= inject(HttpClient);
    data: any=[];

    ngOnInit(): void{
      this.fetchData();
    }

  fetchData(){
      this.httpClient
        .get('http://localhost:8080/api/maxgdp')
        .subscribe((data: any)=>{
          this.data=data;
        })
  }
}
