package com.PetAdoptionService.Dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PetDao {
    private Long petId;
    private String petName;
    private String category;
    private int age;
    private String breed;
    private String sex;
    private String image;
    private String about;
    private Boolean available = true;

}
