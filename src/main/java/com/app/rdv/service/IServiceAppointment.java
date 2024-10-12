package com.app.rdv.service;

import com.app.rdv.entities.Appointment;
import com.app.rdv.entities.Doctor;

import java.util.List;

public interface IServiceAppointment {
    public Appointment addAppointment(Appointment appointment);
    public List<Appointment> getAllAppointments();
}
