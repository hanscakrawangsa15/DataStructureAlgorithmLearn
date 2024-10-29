package ETS;
public class VehicleTest  {
    public static void main(String[] args) {
//        Vehicle v = new Bicycle();
//        Truck t = new Truck();
//        t.start();
//        v.start();
//        t.honk("Mama");
//        Bicycle b = new Bicycle();
//        b.ringBell();
//        b.start();
        Vehicle c = new RacingBicycle("Hizkia", "Racing Type", "Depan",2018, 18, 6);
//        c.start();
        c.displayInfo();

        // public = bisa diakses oleh semua class yang di extend
        // private = hanya dapat diakses dalam 1 class itu doang
        // protected = bisa diakses di package yang lain tetapi harus (class, package, subclass)
        // default =  class package

//        c.setNumGears(8);
//        int n = c.getNumGears();
//
//        System.out.println(n);
//
//        int admin = c.getNumGears();
//        System.out.println(admin);


    }
}
