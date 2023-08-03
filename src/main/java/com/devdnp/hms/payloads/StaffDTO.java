package com.devdnp.hms.payloads;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.*;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@NoArgsConstructor
@Getter
@Setter
public class StaffDTO {


    private String staffId;
    @NotEmpty
    @Size(min = 4, message = "Staff name must have min 4 characters")
    private String name;

    @Email(message = "Your email is not valid")
    private String email;

    @NotEmpty
    @Size(min = 4, message = "Staff Username must have min 4 characters")
    private String loginId;
    @NotEmpty
    @Size(min = 3,max=20,  message = "password must be of min 3 and max 20 characters")
    private String password;

    private String gender;

}
