package com.PetAdoptionService.Controller;

import com.PetAdoptionService.Dao.PetDao;
import com.PetAdoptionService.Entity.Pet;
import com.PetAdoptionService.Service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class PetController {
    @Autowired
    private PetService petService;

    @GetMapping("/pets")
    public List<Pet> GetAllPets() {
        List<Pet> AllPets = petService.GetAllPets();
        return AllPets;
    }

    @PostMapping("/pets")
    public Pet CreatePet(@RequestBody PetDao petDao) {
        return petService.CreatePet(petDao);
    }

    @GetMapping("pets/category/{category}")
    public List<Pet> PetByCategory(@PathVariable String category) {
        List<Pet> PetsByCategory = petService.FindByPetByCategory(category);
        return PetsByCategory;
    }

    @GetMapping("pets/breed/{breed}")
    public List<Pet> PetByBreed(@PathVariable String breed) {
        List<Pet> PetsByBreed = petService.ByBreed(breed);
        return PetsByBreed;
    }


    @GetMapping("pets/single/{petId}")
    public Pet SinglePetDetails(@PathVariable Long petId) {
        Pet singlePet = petService.SinglePetDetails(petId);
        return singlePet;
    }

}
