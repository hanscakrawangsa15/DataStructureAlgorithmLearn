package ETS;
public class Truck extends Vehicle{
    public int numWheels;
    public Truck(String brand, String model, String subtype, int year, int numWheels){
        super("Truck", brand, model, subtype,year);
        this.numWheels = numWheels;
    }
    public void honk(String honking){
        System.out.println("The Truck is Honking");
    }
}
