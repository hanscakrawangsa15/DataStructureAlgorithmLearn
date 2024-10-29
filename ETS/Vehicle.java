package ETS;
public class Vehicle {
    private String vehicleType;
    private String brand;
    private String model;
    private int year;
    private String subtype;


    public Vehicle (String vehicleType,String subtype, String brand, String model, int year){
        this.vehicleType = vehicleType;
        this.subtype = subtype;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void start(){
        System.out.println("The " + vehicleType + " is Starting");
    }
    public void stop(){
        System.out.println("The " + vehicleType + " is Stopping");
    }
    public void accelerate(){
        System.out.println("The " + vehicleType + " is Accelerate");
    }
    public void braking (){
        System.out.println("The " + vehicleType + "is Braking");
    }
    public void displayInfo(){
        System.out.println("Type : " + vehicleType);
        System.out.println("Sub-type : " + subtype);
        System.out.println("Brand  : " +brand);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
    }

}


