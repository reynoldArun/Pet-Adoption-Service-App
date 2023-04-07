package com.PetAdoptionService.Service;

import com.PetAdoptionService.Dao.PetDao;
import com.PetAdoptionService.Entity.Pet;

import java.util.List;

public interface PetService {

    List<Pet> GetAllPets();

    List<Pet> FindByPetByCategory(String category);

    Pet CreatePet(PetDao petDao);

    Pet SinglePetDetails(Long petId);

    List<Pet> ByBreed(String breed);
}
