package com.app.rdv.service;

import com.app.rdv.entities.Appointment;
import com.app.rdv.entities.Doctor;
import com.app.rdv.repository.AppointmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceAppointment implements IServiceAppointment{
    private final  AppointmentRepository appointmentRepository;
    public Appointment addAppointment(Appointment appointment ) {
        return appointmentRepository.save(appointment);
    }
    public List<Appointment> getAllAppointments(){
        return appointmentRepository.findAll();
    }
}
