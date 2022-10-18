public class Tyres extends CarComponent{

    String handling;
    String longevity;

    public Tyres(String name, Double price, String handling, String longevity) {
        super(name, price);
        this.handling = handling;
        this.longevity = longevity;
    }

    public String getHandling() {
        return this.handling;
    }

    public String getLongevity() {
        return this.longevity;
    }

    @Override
    public String getStatus() {
        return "The tyre " + this.name + " has " + this.handling +" handling and " + this.longevity + " longevity.";
    }
}
