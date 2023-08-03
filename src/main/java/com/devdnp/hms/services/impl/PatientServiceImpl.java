package com.devdnp.hms.services.impl;

import com.devdnp.hms.entities.PatientDtl;
import com.devdnp.hms.entities.StaffMaster;
import com.devdnp.hms.exceptions.ResourceNotFoundException;
import com.devdnp.hms.payloads.PatientDTO;
import com.devdnp.hms.payloads.StaffDTO;
import com.devdnp.hms.payloads.UserDTO;
import com.devdnp.hms.repositories.PatientRepo;
import com.devdnp.hms.repositories.StaffRepo;
import com.devdnp.hms.services.PatientService;
import com.devdnp.hms.services.StaffService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepo patientRepo;

    @Autowired(required = true)
    private ModelMapper modelMapper;


    @Override
    public PatientDTO create(PatientDTO patientDTO)  {
        String patientId = UUID.randomUUID().toString();
        patientDTO.setPatientId(patientId);
        if (patientDTO.getStaffId() ==null || patientDTO.getStaffId().isEmpty()){
            throw new RuntimeException("Enter Staff Id");
        }
        if (patientDTO.getPatientName() ==null || patientDTO.getPatientName().isEmpty()){
            throw new RuntimeException("Enter Patient Name");
        }
        if (patientDTO.getPatientAge()==null){
            throw new RuntimeException("Enter Patient Age");
        }
        if (patientDTO.getDoctorName() ==null || patientDTO.getDoctorName().isEmpty()){
            throw new RuntimeException("Enter Doctor Name");
        }
        if (patientDTO.getRoomNo() ==null){
            throw new RuntimeException("Enter Room Number!!");
        }
        return   this.modelMapper.map(  patientRepo.save(this.modelMapper.map(patientDTO, PatientDtl.class)),  PatientDTO.class);
    }

    @Override
    public PatientDTO updateDetails(PatientDTO patientDTO, String patientId)  {
        PatientDtl patientDtl = this.patientRepo.findById(patientId)
                .orElseThrow(()-> new RuntimeException("Patient does not exist with id :"+patientId));

        if (patientDTO.getStatus()!=null )
            patientDtl.setStatus(patientDTO.getStatus());

        if (patientDTO.getPatientAge()!=null && !patientDTO.getPatientName().isEmpty())
            patientDtl.setPatientAge(patientDTO.getPatientAge());

        if (patientDTO.getPatientName()!=null && !patientDTO.getPatientName().isEmpty())
            patientDtl.setPatientName(patientDTO.getPatientName());

        if (patientDTO.getAdmitDate()!=null )
            patientDtl.setAdmitDate(patientDTO.getAdmitDate());

        PatientDtl updatedPatient = this.patientRepo.save(patientDtl);

        return this.modelMapper.map(updatedPatient,PatientDTO.class);
    }

    @Override
    public PatientDTO getSinglePatient(String patientId) {
        PatientDtl patientDtl = this.patientRepo.findByPatientId(patientId)
                .orElseThrow(()-> new RuntimeException("Patient does not exist with id :"+patientId));
        return this.modelMapper.map(patientDtl,PatientDTO.class);
    }

    @Override
    public void deletePatient(String patientId) {
        PatientDtl patientDtl = this.patientRepo.findByPatientId(patientId)
                .orElseThrow(()-> new RuntimeException("Patient does not exist with id :"+patientId));

         this.patientRepo.deleteById(patientId);
        //patientDtl.setIsValid(0);
        //PatientDtl updatedPatient = this.patientRepo.save(patientDtl);
    }

    @Override
    public List<PatientDTO> getAllPatient() {
        List<PatientDtl> patientDtlAll = this.patientRepo.findAll();

        return patientDtlAll.stream().map(p-> this.modelMapper.map(p, PatientDTO.class) )
                .collect(Collectors.toList());
    }

}
