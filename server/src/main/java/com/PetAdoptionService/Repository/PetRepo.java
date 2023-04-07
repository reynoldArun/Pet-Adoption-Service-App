package com.PetAdoptionService.Repository;

import com.PetAdoptionService.Entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepo extends JpaRepository<Pet, Long> {

    List<Pet> findByCategory(String category);

    List<Pet> findByBreed(String breed);
}
