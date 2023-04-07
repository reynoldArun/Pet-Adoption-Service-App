package com.PetAdoptionService.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "Adopter_table")
public class Adopter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long adopterId;

    private String adopterName;

    private String adopterAddress;

    private int adopterNumber;
}
