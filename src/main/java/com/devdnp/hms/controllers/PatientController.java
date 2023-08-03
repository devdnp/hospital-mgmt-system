package com.devdnp.hms.controllers;

import com.devdnp.hms.payloads.ApiResponse;
import com.devdnp.hms.payloads.PatientDTO;
import com.devdnp.hms.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;



    //CREATE
    @PostMapping()
    public ResponseEntity<ApiResponse<PatientDTO>> createPatient(@RequestBody PatientDTO patientDTO){

        PatientDTO patientDTORes = null;
        try {
            patientDTORes = this.patientService.create(patientDTO);
        } catch (Throwable e ) {
            return new ResponseEntity<>(new ApiResponse<>(e.getMessage(), false), HttpStatus.CREATED);
        }
        return new ResponseEntity<>(new ApiResponse<>("patient created successfully!", true, patientDTORes), HttpStatus.CREATED);

    }

    @PutMapping("/{patientId}")
    public ResponseEntity<ApiResponse<PatientDTO>> admitOrDischarge(@RequestBody PatientDTO patientDTO,@PathVariable String patientId)  {
        PatientDTO patientDTORes=null;
        try {
            patientDTORes=this.patientService.updateDetails(patientDTO, patientId);
        }catch (Exception e){

            return new ResponseEntity<>(new ApiResponse<>(e.getMessage(), false), HttpStatus.OK);
        }
        return new ResponseEntity<>(new ApiResponse<>("Patient Updated successfully!", true, patientDTORes), HttpStatus.CREATED);
    }

    @GetMapping("/{patientId}")
    public ResponseEntity<ApiResponse<PatientDTO>> getSinglePatient(@PathVariable String patientId)  {
        System.out.println("PID: "+ patientId);
        PatientDTO patientDTORes=null;
        try {
            patientDTORes=this.patientService.getSinglePatient( patientId);
        }catch (Exception e){

        return new ResponseEntity<>(new ApiResponse<>(e.getMessage(), false), HttpStatus.OK);
        }

        return new ResponseEntity<>(new ApiResponse<>("Successfully!", true, patientDTORes), HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<ApiResponse<List<PatientDTO>>> getAllPatient()  {
        List<PatientDTO> patientDTORes=null;
        try {
            patientDTORes=this.patientService.getAllPatient();
        }catch (Exception e){

            return new ResponseEntity<>(new ApiResponse<>(e.getMessage(), false), HttpStatus.OK);
        }

        return new ResponseEntity<>(new ApiResponse<>("Successfully!", true, patientDTORes), HttpStatus.CREATED);
    }

    @DeleteMapping("/{patientId}")
    public ResponseEntity<ApiResponse> deletePatient(@PathVariable String patientId)  {

        try {

        this.patientService.deletePatient( patientId);
        }catch (Exception e){
        return new ResponseEntity<>(new ApiResponse<>(e.getMessage(), false), HttpStatus.OK);

        }
        return new ResponseEntity<>(new ApiResponse<>("Deleted Successfully!", true), HttpStatus.OK);
    }


}
