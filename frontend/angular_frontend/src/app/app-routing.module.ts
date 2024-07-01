import {RouterModule, Routes} from '@angular/router';
import { NgModule } from '@angular/core';
import { Task1Component } from './task1/task1.component';
import { Task2Component } from './task2/task2.component';
import {HomeComponent} from "./home/home.component";
import {CountryLanguageComponent} from "./country-language/country-language.component";
import {Task3Component} from "./task3/task3.component";


export const routes: Routes = [
  { path: 'task1', component: Task1Component },
  { path: 'countrylanguage/:id', component: CountryLanguageComponent },
  { path: 'task2', component: Task2Component },
  { path: 'task3', component: Task3Component },
  { path: 'home', component: HomeComponent },
  { path: '', redirectTo: '/home', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
