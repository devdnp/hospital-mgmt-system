package com.devdnp.hms.services;

import com.devdnp.hms.entities.StaffMaster;
import com.devdnp.hms.payloads.StaffDTO;
import com.devdnp.hms.payloads.UserDTO;

import java.util.List;

public interface StaffService {

    //CREATE
    StaffDTO login(UserDTO userDTO);

    StaffDTO create(StaffDTO staffDTO);

    String addUser(StaffMaster staffMaster);

    //GET All
    List<StaffMaster> getAll();

    //GET single
    StaffMaster get(String staffId);

    //DELETE
    void deleteStaff(String staffId);

}
