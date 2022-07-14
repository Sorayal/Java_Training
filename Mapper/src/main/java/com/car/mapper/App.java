package com.car.mapper;

public class App {
    public static void main(String[] args) {
        Car.builder().build();
        Car car = Car.builder()
                .make("Morris")
                .numberOfSeats(5)
                .type(CarType.LIMOUSINE)
                .build();

        CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);

        System.out.println("finished");
    }
}
