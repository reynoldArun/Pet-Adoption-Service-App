package com.PetAdoptionService.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "admin_table")
public class Admin {
    @Id
    @GeneratedValue
    private long adminId;
    private String email;
    private String username;
    private String password;
}
