package mapper.mapstruct_example;

public class App {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .make("Morris")
                .numberOfSeats(5)
                .type(CarType.LIMOUSINE)
                .build();
        /*
        Car car = Car.builder()
                .make("Morris")
                .numberOfSeats(5)
                .type(CarType.LIMOUSINE)
                .build();
        */
        CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);

        System.out.println("finished");
    }
}
