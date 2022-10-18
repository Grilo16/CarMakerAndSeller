public class Seats extends CarComponent{

    String materials;
    Boolean heated;

    public Seats(String name, Double price, String materials, Boolean heated) {
        super(name, price);
        this.materials = materials;
        this.heated = heated;
    }

    public String getMaterials() {
        return this.materials;
    }

    public Boolean getHeated() {
        return this.heated;
    }

    @Override
    public String getStatus() {
        if (heated){
            return "The seats " + this.name + " are made of " + this.materials + " and it has a heating function";
        }
            return "The seats " + this.name + " are made of " + this.materials + " and it wont warm up your bum";
    }
}
