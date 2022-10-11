package com.example.DroneAdeniyiMichael.Response;

import com.example.DroneAdeniyiMichael.model.Drone;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AvailableDroneResponse {
    private String message;
    private LocalDateTime timesStamp;
    private List<Drone> availableDrones ;
}
