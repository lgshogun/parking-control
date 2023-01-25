package com.api.parkingcontrol.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ParkingSpotDto(
        @NotBlank
        String parkingSpotNumber,
        @NotBlank
        @Size(max = 7)
        String licensePlateCar,
        @NotBlank
        String brandCar,
        @NotBlank
        String modelCar,
        @NotBlank
        String colorCar,
        @NotBlank
        String responsibleName,
        @NotBlank
        String apartment,
        @NotBlank
        String block,
        @NotBlank
        String registrationDate
) {

}
