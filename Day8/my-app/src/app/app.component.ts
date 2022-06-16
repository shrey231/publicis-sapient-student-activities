import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-app';
  name = 'Shreyas'
  users = [{ name: "Alex", age: 35, gender: "Male" }, { name: "Suma", age: 40, gender: "Female" }];
}
