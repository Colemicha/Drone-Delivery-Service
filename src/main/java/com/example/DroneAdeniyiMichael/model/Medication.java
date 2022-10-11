package com.example.DroneAdeniyiMichael.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Medication {
    @Id
    private String code;
    private String name;
    private int weight;
    private String image;
//    @ManyToOne
//    @JoinColumn(name = "droneId")
//    private Drone drone;


}
