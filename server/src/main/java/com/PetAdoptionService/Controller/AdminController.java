package com.PetAdoptionService.Controller;

import com.PetAdoptionService.Dao.AdminDao;
import com.PetAdoptionService.Entity.Admin;
import com.PetAdoptionService.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping
    public ResponseEntity<String> CreateAdmin(@RequestBody AdminDao adminDao) {
        String admin = adminService.createAdmin(adminDao);
        return ResponseEntity.ok(admin);
    }

    @GetMapping("/login/{adminId}")
    public ResponseEntity<Admin> GetSingleAdmin(@PathVariable long adminId) {
        Admin admin = adminService.GetAdminById(adminId);
        return ResponseEntity.ok(admin);
    }


}
