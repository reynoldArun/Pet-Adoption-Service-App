package com.PetAdoptionService.Dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class AdminDao {
    private long adminId;
    private String email;
    private String username;
    private String password;
}