package com.devdnp.hms.security;



import com.devdnp.hms.entities.StaffMaster;
import com.devdnp.hms.exceptions.ResourceNotFoundException;
import com.devdnp.hms.repositories.StaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService
        //implements UserDetailsService
        {
            /*


    @Autowired
    private StaffRepo staffRepo;

    @Override
    public UserDetails loadUserByUsername(String loginId) throws UsernameNotFoundException {
        //User_ entity type
        StaffMaster user = this.staffRepo.findByLoginId(loginId).orElseThrow(()-> new ResourceNotFoundException("User ", "Email : "+loginId, 0));
        return user;
    }



             */
}