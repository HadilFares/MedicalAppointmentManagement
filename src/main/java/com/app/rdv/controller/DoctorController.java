package com.app.rdv.controller;

import com.app.rdv.entities.Doctor;
import com.app.rdv.entities.Patient;
import com.app.rdv.service.IServiceDoctor;
import com.app.rdv.service.IServicePatient;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/api/doctor")
public class DoctorController {

    private IServiceDoctor iServiceDoctor;
    @PostMapping("add")
    public Doctor add(@RequestBody Doctor  doctor ){
        return iServiceDoctor.addDoctor(doctor);
    }
    @GetMapping("all")
    public List<Doctor> alldoctors(){
        return iServiceDoctor.getAllDoctors();
    }







}
