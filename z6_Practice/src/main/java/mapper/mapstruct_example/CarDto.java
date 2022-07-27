package mapper.mapstruct_example;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
//@Builder
public class CarDto {
    private String make;
    private int seatCount;
    private String type;

    public CarDto(){};

    private CarDto(Builder builder){
        make = builder.make;
        seatCount = builder.seatCount;
        type = builder.type;
    }
    public static class Builder{
        private String make = "";
        private int seatCount = 0;
        private String type = "";

        public Builder make(String value) {
            make = value;
            return this;
        }

        public Builder seatCount(int value) {
            seatCount = value;
            return this;
        }

        public Builder type(String value) {
            type = value;
            return this;
        }
        public CarDto build() {
            return new CarDto(this);
        }
    }




    // Getters and Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
