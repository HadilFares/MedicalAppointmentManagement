package com.app.rdv.controller;

import com.app.rdv.entities.Appointment;
import com.app.rdv.entities.Doctor;
import com.app.rdv.service.IServiceAppointment;
import com.app.rdv.service.IServiceDoctor;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/appointment")
public class AppointmentController {

    private IServiceAppointment iServiceAppointment;
    @PostMapping("add")
    public Appointment add(@RequestBody Appointment appointment ){
        return iServiceAppointment.addAppointment(appointment);
    }
    @GetMapping("all")
    public List<Appointment> alldoctors(){
        return iServiceAppointment.getAllAppointments();
    }


}
