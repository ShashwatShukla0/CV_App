import { Component } from '@angular/core';

@Component({
  selector: 'app-cover',
  templateUrl: './cover.component.html',
  styleUrls: ['./cover.component.css']
})
export class CoverComponent {


  scrollDown() {
    window.scrollTo(0, document.body.scrollHeight);
  }

}
