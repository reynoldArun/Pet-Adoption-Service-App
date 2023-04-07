package com.PetAdoptionService.Service;


import com.PetAdoptionService.Dao.AdminDao;
import com.PetAdoptionService.Entity.Admin;

public interface AdminService {

     public String createAdmin(AdminDao adminDao);

     public Admin GetAdminById(long adminId);



}
