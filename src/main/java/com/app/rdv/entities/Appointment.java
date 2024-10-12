package com.app.rdv.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Appointment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Status;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",shape=JsonFormat.Shape.STRING)
    private LocalDateTime AppointmentDate;
    @ManyToOne
    Patient patient;
    @ManyToOne
    Doctor doctor;
}
