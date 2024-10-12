package com.app.rdv.service;

import com.app.rdv.entities.Doctor;
import com.app.rdv.entities.Patient;

import javax.print.Doc;
import java.util.List;

public interface IServiceDoctor {
    public Doctor addDoctor(Doctor doctor);
    public List<Doctor> getAllDoctors();

}
