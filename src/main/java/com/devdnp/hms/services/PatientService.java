package com.devdnp.hms.services;

import com.devdnp.hms.payloads.PatientDTO;

import java.util.List;

public interface PatientService {



    PatientDTO create(PatientDTO patientDTO) ;

    PatientDTO updateDetails(PatientDTO patientDTO, String patientId);

    PatientDTO getSinglePatient(String patientId);
    void deletePatient(String patientId);


   List<PatientDTO> getAllPatient();
}
