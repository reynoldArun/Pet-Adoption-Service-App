package com.PetAdoptionService.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "pet_table")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
