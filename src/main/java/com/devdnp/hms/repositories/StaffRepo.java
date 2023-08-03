package com.devdnp.hms.repositories;

import com.devdnp.hms.entities.StaffMaster;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StaffRepo extends JpaRepository<StaffMaster,String> {

    Optional<StaffMaster> findByLoginId(String loginId);

    Optional<StaffMaster> findByName(String username);
}
