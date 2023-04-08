import { Component, OnInit } from '@angular/core';
import { PetserviceService } from 'src/app/service/petservice.service';

@Component({
  selector: 'app-allpets',
  templateUrl: './allpets.component.html',
  styleUrls: ['./allpets.component.css']
})
export class AllpetsComponent implements OnInit {

  pets:any = [];

  constructor(private petService: PetserviceService) {}

  ngOnInit(): void {
    this.GetAllPets()
  }

  public GetAllPets() {
    this.petService.GetAllPets().subscribe(data => this.pets=data)
    
  }

}
