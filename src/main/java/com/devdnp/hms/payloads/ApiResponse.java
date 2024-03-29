package com.devdnp.hms.payloads;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {
    private String message;
    private boolean status;
    private T data;


    public ApiResponse(String message, boolean status) {
        this.message = status?"Successful: "+ message:"Unsuccessful: "+ message;
        this.status = status;
    }

    public ApiResponse(String message, boolean status, T data) {
        this.message = status?"Successful: "+ message:"Unsuccessful: "+ message;
        this.status = status;
        this.data = data;
    }
}