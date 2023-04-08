import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class PetserviceService {

  constructor(private http: HttpClient) { }


  public GetAllPets() {
    return this.http.get<any>("http://localhost:8080/pets")
  }

}
