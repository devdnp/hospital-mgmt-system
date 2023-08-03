package com.devdnp.hms.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


 */
import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="staff_mst")
public class StaffMaster
        //implements UserDetails
{


    @Id
    @Column(name="staff_id", nullable = false)
    private String staffId;

    @Column(name = "full_name", nullable = false, length = 100)
    private String name;

    @Column(name = "gender", nullable = false, length = 10)
    private String gender;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "login_id", nullable = false, length = 50)
    private String loginId;

    @Column(name = "password", nullable = false, length = 100)
    private String password;

    @Column(name="entry_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;

    @PrePersist
    protected void onCreate() {
        entryDate = new Date();
    }
/*
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority(loginId));
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

 */
}
