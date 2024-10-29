package ETS;
public class RacingBicycle extends Bicycle{
    private String body;
    private int weight;
    public RacingBicycle(String brand, String subtype, String body, int year, int weight, int numGear){
        super("RacingBicycle", brand, subtype, year, numGear);
        this.body = body;
        this.weight = weight;

    }
    public void gearUp(){
        System.out.println("Gear Up");
    }

}
