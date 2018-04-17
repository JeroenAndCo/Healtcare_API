package com.pharmacy.healthcare.controller;

import com.pharmacy.healthcare.domain.Admin;
import com.pharmacy.healthcare.domain.Patient;
import com.pharmacy.healthcare.repository.UserRepository;
import com.pharmacy.healthcare.services.AdminService;
import com.pharmacy.healthcare.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admins")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateUser(@PathVariable("id") long id,
                                        @RequestBody Admin admin){
            return new ResponseEntity<>(adminService.updateUser(id, admin), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getAllEmployees()
    {
        return new ResponseEntity<>(userRepository.findAllByType(), HttpStatus.OK);
    }
}
