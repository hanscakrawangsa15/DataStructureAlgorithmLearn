package ETS;
public class Bicycle extends Vehicle {
    private int numGears;
    public Bicycle (String brand, String model, String subtype, int year, int numGears){
        super("Bicycle", brand, model, subtype, year);
        this.numGears = numGears;
    }
    public void ringBell(){
        System.out.println("The Bicycle is Ringing its bell");
    }
    public void setNumGears(int num){
        this.numGears = ++num;
    }
    public int getNumGears(){
        return this.numGears;
    }
    @Override
    public void braking (){
        System.out.println("The Bicycle is Braking");
    }
    //Overloading
    public int getNumGears(String role){
        if (role == "admin"){
            return this.numGears;
        }
        else {
            System.out.println("kon sopo");
        }
        return 0;
    }

}
