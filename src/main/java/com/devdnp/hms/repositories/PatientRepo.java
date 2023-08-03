package com.devdnp.hms.repositories;

import com.devdnp.hms.entities.PatientDtl;
import com.devdnp.hms.entities.StaffMaster;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PatientRepo extends JpaRepository<PatientDtl,String> {

    Optional<PatientDtl> findByPatientId(String id);

}
