package com.PetAdoptionService.ServiceImpl;

import com.PetAdoptionService.Dao.PetDao;
import com.PetAdoptionService.Entity.Pet;
import com.PetAdoptionService.Repository.PetRepo;
import com.PetAdoptionService.Service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetServiceImpl implements PetService {

    @Autowired
    private PetRepo petRepo;

    @Override
    public List<Pet> GetAllPets() {
        return petRepo.findAll();
    }

    @Override
    public List<Pet> FindByPetByCategory(String category) {
        return petRepo.findByCategory(category);
    }

    @Override
    public List<Pet> ByBreed(String breed) {
        return petRepo.findByBreed(breed);
    }


    @Override
    public Pet CreatePet(PetDao petDao) {
        Pet newPet = new Pet();
        newPet.setPetName(petDao.getPetName());
        newPet.setCategory(petDao.getCategory());
        newPet.setSex(petDao.getSex());
        newPet.setBreed(petDao.getBreed());
        newPet.setAge(petDao.getAge());
        newPet.setImage(petDao.getImage());
        newPet.setAbout(petDao.getAbout());
        newPet.setAvailable(true);
        return petRepo.save(newPet);
    }

    @Override
    public Pet SinglePetDetails(Long petId) {
        return petRepo.findById(petId).get();
    }
}
