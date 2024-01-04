import { Component } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Message} from "@angular/compiler/src/i18n/i18n_ast";
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(private httpClient: HttpClient) {
    httpClient.get('http://localhost:8082/hello');
  }
  title = 'frontend-angular';
}
