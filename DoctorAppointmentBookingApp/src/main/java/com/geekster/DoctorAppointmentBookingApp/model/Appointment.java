
package com.geekster.DoctorAppointmentBookingApp.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,scope = Appointment.class,property = "appointmentId")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer appointmentId;
    private String  appointmentDesc;

    LocalDateTime appCreationTime;
    LocalDateTime appScheduleTime;


    @ManyToOne()
    @JoinColumn(name = "fk_patient_id")
    Patient patient;

    @ManyToOne()
    @JoinColumn(name = "fk_doc_id")
    Doctor doctor;


}
