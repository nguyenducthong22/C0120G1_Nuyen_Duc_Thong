import { Component, OnInit } from '@angular/core';
import {STUDENTS} from "../StudentDao";
import {IStudent} from "../IStudent";

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {
  students =STUDENTS;
  studentDetail: IStudent;

  constructor() { }

  changeStudent(student :IStudent){
    this.studentDetail=student;
  }

  getMark(value :any){
    this.studentDetail.mark=value;
  }

  ngOnInit(): void {
  }

}
