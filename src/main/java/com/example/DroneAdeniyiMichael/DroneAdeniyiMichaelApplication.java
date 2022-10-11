package com.example.DroneAdeniyiMichael;

import com.example.DroneAdeniyiMichael.enumeration.Model;
import com.example.DroneAdeniyiMichael.enumeration.State;
import com.example.DroneAdeniyiMichael.model.Drone;
import com.example.DroneAdeniyiMichael.model.Medication;
import com.example.DroneAdeniyiMichael.repository.DroneRepository;
import com.example.DroneAdeniyiMichael.repository.MedicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DroneAdeniyiMichaelApplication implements CommandLineRunner {

    @Autowired
    DroneRepository droneRepository;

    @Autowired
    MedicationRepository medicationRepository;

    public static void main(String[] args) {
        SpringApplication.run(DroneAdeniyiMichaelApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Medication newMed = new Medication("MD1" , "Anti-Malaria",  95, "0xe2bcf.png");
        Medication newMed2 = new Medication("MD2" , "Anti-Malaria",  95, "0xe2bcf.png");

        medicationRepository.save(newMed);
        medicationRepository.save(newMed2);
        medicationRepository.save(new Medication("MD1" , "Ibuprofen",  50, "0xudbcf.png"));
        medicationRepository.save(new Medication("MD2" , "Sidenafil",  150, "0xudbcf.png"));
        medicationRepository.save(new Medication("MD3" , "7-keys",  50, "0xudbcf.png"));

//        System.out.println(medicationRepository.findAll());

        droneRepository.save(new Drone("DRN1", Model.HEAVYWEIGHT , (short) 500, 100, State.IDLE , null) );
        droneRepository.save(new Drone("DRN2", Model.LIGHTWEIGHT , (short) 300, 20, State.IDLE , null) );
        droneRepository.save(new Drone("DRN3", Model.CRUISERWEIGHT , (short) 450, 89, State.IDLE , null)) ;
        droneRepository.save(new Drone("DRN4", Model.MIDDLEWEIGHT , (short) 500, 15, State.IDLE , null)) ;
        droneRepository.save(new Drone("DRN5", Model.HEAVYWEIGHT , (short) 500, 100, State.IDLE , null) );
        droneRepository.save(new Drone("DRN6", Model.HEAVYWEIGHT , (short) 500, 90, State.IDLE , null) );
        droneRepository.save(new Drone("DRN7", Model.MIDDLEWEIGHT , (short) 500, 100, State.IDLE , null)) ;
        droneRepository.save(new Drone("DRN8", Model.CRUISERWEIGHT , (short) 500, 10, State.IDLE , null)) ;
        droneRepository.save(new Drone("DRN9", Model.LIGHTWEIGHT , (short) 500, 65, State.IDLE , null) );
        droneRepository.save(new Drone("DRN10", Model.HEAVYWEIGHT , (short) 500, 100, State.IDLE , null)) ;

    }
}
