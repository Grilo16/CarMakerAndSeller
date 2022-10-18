public class Engine extends CarComponent{

    int horsePower;
    String fuelType;

    public Engine(String name, Double price, int horsePower, String fuelType) {
        super(name, price);
        this.horsePower = horsePower;
        this.fuelType = fuelType;
    }


    public int getHorsePower() {
        return this.horsePower;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    @Override
    public String getStatus() {
        return "The Engine " + this.name + " has " + this.horsePower + " horsepower and runs on " + this.fuelType;
    }
}
