package com.example.DroneAdeniyiMichael.exception;

public class MedicationNotFoundException extends RuntimeException{
    public MedicationNotFoundException(String medId){
        super("Medication with " + medId + "not Found");
    }
}
