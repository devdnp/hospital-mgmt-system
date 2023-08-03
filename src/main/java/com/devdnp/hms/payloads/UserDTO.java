package com.devdnp.hms.payloads;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Getter
@Setter
public class UserDTO {
    @NotEmpty
    @Size(min = 4, message = "Staff Username must have min 4 characters")
    private String loginId;

    @NotEmpty
    @Size(min = 3,max=20,  message = "password must be of min 3 and max 20 characters")
    private String password;
}
