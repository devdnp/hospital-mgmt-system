package com.devdnp.hms.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="patient_mst")
public class PatientDtl {

    //name, age, room, doctor name, admit date, expenses, status(admitted, discharged)

    @Id
    @Column(name="patient_id", nullable = false)
    private String patientId;

    @Column(name="patient_name", nullable = false, length = 100)
    private String patientName;

    @Column(name = "gender", nullable = false, length = 10)
    private String gender;

    @Column(name="patient_age", nullable = false, length = 50)
    private Integer patientAge;

    @Column(name="room_no", nullable = false, length = 50)
    private Integer roomNo;

    @Column(name="doctor_name", nullable = false, length = 100)
    private String doctorName;

    @Column(name="admit_date", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date admitDate;

    @Column(name="entry_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;
    @PrePersist
    protected void onCreate() {
        entryDate = new Date();
    }

    @Column(name="expenses", nullable = true)
    private Double expenses;

    @Column(name="status_flag", nullable = true)
    private Integer status;

    @Column(name = "is_valid", nullable = false)
    private Integer isValid;

    @Column(name="staff_id", nullable = false)
    private String staffId;

}
