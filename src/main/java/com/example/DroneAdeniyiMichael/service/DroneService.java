package com.example.DroneAdeniyiMichael.service;


import com.example.DroneAdeniyiMichael.Response.*;
import com.example.DroneAdeniyiMichael.model.Drone;

import java.util.List;


public interface DroneService {

    Drone findDroneById(String serialNumber);
    List<Drone> getAllDrones();
    RegisterResponse createDrone(Drone drone);

    AvailableDroneResponse getAvailableDrones(List<Drone> allDroneLists);

    BatteryLevelResponse checkBatteryLevel(String serialNumber);

    LoadDroneResponse loadMedication(String droneSerialCode, String medicationCode);

    LoadedMedicationResponse loadedMedicationsForADrone(String serialNumber);

    void periodicCheckForBatteryHealth(List<Drone> drones);


}
