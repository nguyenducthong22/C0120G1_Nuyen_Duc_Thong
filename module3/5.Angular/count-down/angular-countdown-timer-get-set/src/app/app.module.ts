import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ConuntdouwnTimerGetSetComponent } from './conuntdouwn-timer-get-set/conuntdouwn-timer-get-set.component';

@NgModule({
    declarations: [
        AppComponent,
        ConuntdouwnTimerGetSetComponent,
    ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
