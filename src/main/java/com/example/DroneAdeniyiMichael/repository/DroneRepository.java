package com.example.DroneAdeniyiMichael.repository;

import com.example.DroneAdeniyiMichael.model.Drone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DroneRepository extends JpaRepository<Drone,String> {

}
