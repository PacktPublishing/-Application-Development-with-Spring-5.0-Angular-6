import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-pet-list',
  templateUrl: './pet-list.component.html',
  styleUrls: ['./pet-list.component.css']
})
export class PetListComponent implements OnInit {
  pets: any[];
  constructor(private router: Router) { }

  ngOnInit() {
    this.pets = this.router.getNavigatedData();
  }
}
