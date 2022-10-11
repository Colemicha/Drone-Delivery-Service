package com.example.DroneAdeniyiMichael.model;
import com.example.DroneAdeniyiMichael.enumeration.Model;
import com.example.DroneAdeniyiMichael.enumeration.State;

import lombok.*;

import javax.persistence.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

@Table(name="drone_db")
public class Drone {
    @Id
    @Size(max = 500)
    private String serialNumber;
    @NotNull(message = "this filled must be filled")
    private Model model;
    private short weight;
    private int batteryCapacity;
    private State stateOfDuty;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Medication> medication;
}
