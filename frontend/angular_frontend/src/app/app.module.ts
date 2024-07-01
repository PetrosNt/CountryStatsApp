import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import {AppRoutingModule} from "./app-routing.module";
import {Task3Component} from "./task3/task3.component";
import {FormsModule} from "@angular/forms";

@NgModule({
  declarations: [

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    Task3Component,
    FormsModule
  ],
  providers: [],
  bootstrap: []
})
export class AppModule { }
