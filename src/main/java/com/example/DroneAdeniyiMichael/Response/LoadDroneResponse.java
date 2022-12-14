package com.example.DroneAdeniyiMichael.Response;

import com.example.DroneAdeniyiMichael.model.Medication;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoadDroneResponse {
    private String message;
    private LocalDateTime timesStamp;
    private String serialNumber;
    private List<Medication> medications;

}
