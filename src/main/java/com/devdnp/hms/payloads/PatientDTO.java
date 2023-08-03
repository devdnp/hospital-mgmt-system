package com.devdnp.hms.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
@NoArgsConstructor
@Getter
@Setter
public class PatientDTO {
    private String patientId;

    private String staffId;

    private String patientName;

    private Integer patientAge;

    private Integer roomNo;

    private String doctorName;

   private Double expenses;

    private Integer status;

    private Date admitDate;

    private final Integer isValid=1;

    private String gender;
}
