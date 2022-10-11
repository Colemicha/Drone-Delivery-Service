package com.example.DroneAdeniyiMichael.service;
import com.example.DroneAdeniyiMichael.model.Medication;

import java.util.List;

public interface MedicationService {
    Medication createMedication(Medication medication);

    List<Medication> getMedications();

    Medication findMedicationByCode(String code);
    boolean validateCode(String code);

    boolean validateName(String name);
}
