/*
 * Angular 2 decorators and services
 */
import { Component, ViewEncapsulation } from '@angular/core';

import { AppState } from './app.service';

/*
 * App Component
 * Top Level Component
 */
@Component({
  selector: 'app',
  encapsulation: ViewEncapsulation.None,
  styles: ['./app.component.scss'],
  template: '<router-outlet></router-outlet>'
})
export class AppComponent {

  constructor() {

  }

  ngOnInit() {
    
  }

}
