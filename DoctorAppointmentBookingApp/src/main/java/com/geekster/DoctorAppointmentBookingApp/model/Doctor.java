package com.geekster.DoctorAppointmentBookingApp.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.List;



@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,scope = Doctor.class,property = "docId")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer docId;
    private String  docName;
    private double  docFee;

    @Enumerated(value = EnumType.STRING)
    private Specialization docSpecialization;

    @Enumerated(value = EnumType.STRING)
    private Qualification docQualification;

    private String docContact;

    @OneToMany(mappedBy = "doctor")
    List<Appointment> appointments;

    public Doctor() {
    }

    public Doctor(Integer docId, String docName, double docFee, Specialization docSpecialization, Qualification docQualification, String docContact, List<Appointment> appointments) {
        this.docId = docId;
        this.docName = docName;
        this.docFee = docFee;
        this.docSpecialization = docSpecialization;
        this.docQualification = docQualification;
        this.docContact = docContact;
        this.appointments = appointments;
    }

    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public double getDocFee() {
        return docFee;
    }

    public void setDocFee(double docFee) {
        this.docFee = docFee;
    }

    public Specialization getDocSpecialization() {
        return docSpecialization;
    }

    public void setDocSpecialization(Specialization docSpecialization) {
        this.docSpecialization = docSpecialization;
    }

    public Qualification getDocQualification() {
        return docQualification;
    }

    public void setDocQualification(Qualification docQualification) {
        this.docQualification = docQualification;
    }

    public String getDocContact() {
        return docContact;
    }

    public void setDocContact(String docContact) {
        this.docContact = docContact;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
}
