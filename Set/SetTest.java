package Set;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Pelanggan hans = new Pelanggan("Hans","Kang");
        Pelanggan ade = new Pelanggan("Ade", "Mas");

        Set<Pelanggan> ps = new HashSet<Pelanggan>();
        System.out.println(ps.add(hans));
        System.out.println(ps.add(ade));
        System.out.println(ps.add(hans)); //output false because its already known hans values
        System.out.println(ps.add(new Pelanggan("Defita", "Mbak"))); // yang perlu di garis bawahi adalah ada hashcode dan equals yang merupakan syarat dari set
        System.out.println();


    }
}
