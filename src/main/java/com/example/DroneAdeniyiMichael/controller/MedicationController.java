package com.example.DroneAdeniyiMichael.controller;

import com.example.DroneAdeniyiMichael.model.Medication;
import com.example.DroneAdeniyiMichael.service.MedicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/medication")
public class MedicationController {

    private final MedicationService medicationService;

    @Autowired
    public MedicationController(MedicationService medicationService) {
        this.medicationService = medicationService;
    }


    @PostMapping(value = "/addmedication")
    public Medication addMedication(@RequestBody Medication medication){
        return  medicationService.createMedication(medication);
    }
}
