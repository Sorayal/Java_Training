package mapper.mapstruct_example;

// Lombok doesnt work with Mapstruct
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
//@Builder
public class Car {
    private String make;
    private int numberOfSeats;
    private CarType type;


    private Car(Builder builder){
        make = builder.make;
        numberOfSeats = builder.numberOfSeats;
        type = builder.type;
    }
    public static class Builder{
        private String make = "";
        private int numberOfSeats = 0;
        private CarType type = null;

        public Builder make(String value) {
            make = value;
            return this;
        }

        public Builder numberOfSeats(int value) {
            numberOfSeats = value;
            return this;
        }

        public Builder type(CarType value) {
            type = value;
            return this;
        }
        public Car build() {
            return new Car(this);
        }
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }
}
