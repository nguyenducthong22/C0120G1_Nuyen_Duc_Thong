import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {IStudent} from "../IStudent";

@Component({
  selector: 'app-student-detail',
  templateUrl: './student-detail.component.html',
  styleUrls: ['./student-detail.component.css']
})
export class StudentDetailComponent implements OnInit {
  @Input()
  studentDetail : IStudent;
  @Output()
  changeMark = new EventEmitter();
  mark=0;

  constructor() { }

  ngOnInit(): void {
  }

  setMark(value: any) {
    this.mark=value;
    this.changeMark.emit(this.mark)
  }
}
