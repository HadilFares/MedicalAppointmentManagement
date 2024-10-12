package com.app.rdv.service;

import com.app.rdv.entities.Doctor;
import com.app.rdv.entities.Patient;
import com.app.rdv.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ServiceDoctor implements IServiceDoctor{
    private final DoctorRepository doctorRepository;
    public Doctor addDoctor(Doctor doctor ) {
        return doctorRepository.save(doctor);
    }
    public List<Doctor> getAllDoctors(){
        return doctorRepository.findAll();
    }
}
