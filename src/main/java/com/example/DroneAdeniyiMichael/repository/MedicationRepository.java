package com.example.DroneAdeniyiMichael.repository;

import com.example.DroneAdeniyiMichael.model.Medication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicationRepository extends JpaRepository<Medication , String> {

}
