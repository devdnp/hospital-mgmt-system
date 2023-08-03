package com.devdnp.hms.payloads;



import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@JsonInclude(JsonInclude.Include.NON_NULL)
public class JwtAuthResponse<T> {
    private String message;
    private boolean status;
    private T token;
    private StaffDTO staffDTO;

    public JwtAuthResponse(String message, boolean status) {
        this.message = message;
        this.status = status;
    }

    public JwtAuthResponse(String message, boolean status, T token, StaffDTO staffDTO) {
        this.message = message;
        this.status = status;
        this.token = token;
        this.staffDTO = staffDTO;
    }

    public JwtAuthResponse(String s, boolean b, StaffDTO staffDTO) {
    }
}
