package Tree;

import java.util.Set;
import java.util.TreeSet;

public class SetCoba {
    public static void main(String[] args) {
        String a = "KLACK";
        String b = "ADAM";
        visitedCities(a,b);
    }
    public static void visitedCities(String a, String b){
        Set<Character> r1 = new TreeSet<>();
        Set<Character> r2 = new TreeSet<>();
        for (int i=0; i<a.length(); i++){
            r1.add(a.charAt(i));
        }
        for (int j=0; j<b.length();j++){
            r2.add(b.charAt(j));
        }
        // nyari kota yang dilalui oleh r1 dan r2
        Set<Character> rtemp = new TreeSet<>();
        rtemp.addAll(r1);
        rtemp.retainAll(r2); //mempertahankan nilai dari rq

        // ngegabungin nilai r1 dan r2
        r1.addAll(r2);
        System.out.println(r1); // kegabung semua dan gak ada nilai yang sama karena set sifatnya tidak boleh ada duplikat value

        // menghapus nilai yang ada di rtemp yang udah dilalui 2x di r1 dan r2
        r1.removeAll(rtemp);

        for (Character r : r1){
            System.out.print(r);
        }
    }
}
