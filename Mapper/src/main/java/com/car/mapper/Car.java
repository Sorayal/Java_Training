package com.car.mapper;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Car {
    private String make;
    private int numberOfSeats;
    private CarType type;
}
