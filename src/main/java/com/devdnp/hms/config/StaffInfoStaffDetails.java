package com.devdnp.hms.config;

import com.devdnp.hms.entities.StaffMaster;

import java.util.Collection;
import java.util.List;

public class StaffInfoStaffDetails
        //implements UserDetails
{

    private String loginId;

    private String password;


    public StaffInfoStaffDetails(StaffMaster staffMaster){
        loginId = staffMaster.getName();
        password = staffMaster.getPassword();
    }
/*
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return loginId;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    */
}
