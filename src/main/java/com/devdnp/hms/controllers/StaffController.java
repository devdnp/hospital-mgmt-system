package com.devdnp.hms.controllers;

import com.devdnp.hms.entities.StaffMaster;
import com.devdnp.hms.payloads.ApiResponse;
import com.devdnp.hms.payloads.StaffDTO;
import com.devdnp.hms.payloads.UserDTO;
import com.devdnp.hms.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;


    @PostMapping("/login")
    public ResponseEntity<ApiResponse<StaffDTO>> login(@RequestBody UserDTO userDTO){
        StaffDTO staffDTO = this.staffService.login(userDTO);
        if(staffDTO==null){
            return new ResponseEntity<>(new ApiResponse<>("Login or Password may not correct", false), HttpStatus.CREATED);
        } else {
        return new ResponseEntity<>(new ApiResponse<>("Staff login successfully11!", true, staffDTO), HttpStatus.CREATED);

        }
    }

    @PostMapping("/new_staff")
    public String addNewStaff(@RequestBody StaffMaster staffMaster){
        return staffService.addUser(staffMaster);
    }



    //CREATE
    @PostMapping("/register")
    public ResponseEntity<ApiResponse<StaffDTO>> createStaff(@RequestBody StaffDTO staffDTO){

        StaffDTO staffDTORes = null;
        try {
            staffDTORes = this.staffService.create(staffDTO);
        } catch (Exception e) {
            return new ResponseEntity<>(new ApiResponse<>(e.getMessage(), false), HttpStatus.CREATED);
        }
        return new ResponseEntity<>(new ApiResponse<>("Staff created successfully!", true, staffDTORes), HttpStatus.CREATED);

    }

    //GET All
    @GetMapping("/{staffId}")
    public ResponseEntity<StaffMaster> getStaff(@PathVariable String hotelId){
        return ResponseEntity.status(HttpStatus.OK).body(staffService.get(hotelId));
    }

}
