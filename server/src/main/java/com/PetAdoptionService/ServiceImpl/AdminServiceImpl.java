package com.PetAdoptionService.ServiceImpl;

import com.PetAdoptionService.Dao.AdminDao;
import com.PetAdoptionService.Entity.Admin;
import com.PetAdoptionService.Repository.AdminRepo;
import com.PetAdoptionService.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepo adminRepo;

    @Override
    public String createAdmin(AdminDao adminDao) {
        Admin admin = new Admin();
        admin.setUsername(adminDao.getUsername());
        admin.setEmail(adminDao.getEmail());
        admin.setPassword(adminDao.getPassword());
        adminRepo.save(admin);
        return "Admin Created Successfully!!";
    }

    @Override
    public Admin GetAdminById(long adminId) {
        Admin admin = adminRepo.findById(adminId).orElseThrow(() -> new NullPointerException());
        return admin;
    }
}
