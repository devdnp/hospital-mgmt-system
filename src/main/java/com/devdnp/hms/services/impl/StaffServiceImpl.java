package com.devdnp.hms.services.impl;

import com.devdnp.hms.entities.StaffMaster;
import com.devdnp.hms.exceptions.ResourceNotFoundException;
import com.devdnp.hms.payloads.StaffDTO;
import com.devdnp.hms.payloads.UserDTO;
import com.devdnp.hms.repositories.StaffRepo;
import com.devdnp.hms.services.StaffService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffRepo staffRepo;

    @Autowired(required = true)
    private ModelMapper modelMapper;

    //@Autowired
   // private PasswordEncoder passwordEncoder;

    @Override
    public StaffDTO login(UserDTO userDTO) {
        StaffMaster staffMaster= staffRepo.findByLoginId(userDTO.getLoginId()).orElseThrow(()->new ResourceNotFoundException("Staff with given id not found"));


        System.out.println("^^^^"+staffMaster.getLoginId());
        System.out.println("passwoed db  ---  "+staffMaster.getPassword());
        System.out.println("passuserdto  ---  "+userDTO.getPassword());
        if(staffMaster.getPassword().equals(userDTO.getPassword())){
            System.out.println("password match");
            return this.modelMapper.map(staffMaster, StaffDTO.class);
        }else {
            System.out.println("password not match");

        }
        return null;
    }

    @Override
    public StaffDTO create(StaffDTO staffDTO) {
        String staffId = UUID.randomUUID().toString();
        staffDTO.setStaffId(staffId);

        return   this.modelMapper.map(  staffRepo.save(this.modelMapper.map(staffDTO, StaffMaster.class)),  StaffDTO.class);
    }

    @Override
    public String addUser(StaffMaster staffMaster){
        //staffMaster.setPassword(passwordEncoder.encode(staffMaster.getPassword()));
        staffRepo.save(staffMaster);
        return "Staff added to system";
    }

    @Override
    public List<StaffMaster> getAll() {
        return staffRepo.findAll();
    }

    @Override
    public StaffMaster get(String staffId) {
        return staffRepo.findById(staffId).orElseThrow(()->new ResourceNotFoundException("Staff with given id not found"));
    }

    @Override
    public void deleteStaff(String staffId) {
        StaffMaster staffMaster = this.staffRepo.findById(staffId)
                .orElseThrow(()->new ResourceNotFoundException("Staff with this id not found "+staffId));
        this.staffRepo.delete(staffMaster);
    }
}
