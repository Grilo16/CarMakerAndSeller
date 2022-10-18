import java.util.ArrayList;
import java.util.Arrays;

public class Car {
    String name;
    String manufacture;
    ArrayList<CarComponent> carComponentsArray;

    Double price;

    public Car(String name, String manufacture, CarComponent... carComponents) {
        this.name = name;
        this.manufacture = manufacture;
        this.carComponentsArray = new ArrayList<>();
        carComponentsArray.addAll(Arrays.asList(carComponents));
        calculatePrice();
    }


    private void calculatePrice() {
        Double totalPrice = 0.0;
        for (CarComponent component: this.carComponentsArray){
            totalPrice += component.getPrice();
        }
        this.price = totalPrice;
    }

    public String getName() {
        return this.name;
    }

    public String getManufacture() {
        return this.manufacture;
    }

    public ArrayList<CarComponent> getCarComponentsArray() {
        return this.carComponentsArray;
    }

    public Double getPrice() {
        return this.price;
    }


}
