package com.car.mapper;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CarDto {
    private String make;
    private int seatCount;
    private String type;
}
