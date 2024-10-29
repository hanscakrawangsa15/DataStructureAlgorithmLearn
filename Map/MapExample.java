package Map;

import java.util.Map;
import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		
		Map<Integer, String> asdIUP = new HashMap<>();
		
		asdIUP.put(1049, "Justin");
		asdIUP.put(1050, "Gerald");
		asdIUP.put(1051, "Aurellia");
		
		System.out.println(asdIUP.isEmpty());
		System.out.println(asdIUP.size());
		
		System.out.println(asdIUP);
		
		for(String name : asdIUP.values()) {
			System.out.println(name + ", S.Kom.");
		}
		
		for(Integer nrp : asdIUP.keySet()) {
			System.out.println(nrp);
		}
		
		System.out.println(asdIUP.containsValue("Gerald"));
		
		Map<Integer, String> asdIUPnew = new HashMap<>();
		
		asdIUPnew.put(1052, "Angela");
		asdIUPnew.put(1054, "Ameera");
		asdIUPnew.put(1055, "Rafi'");
		
		asdIUP.putAll(asdIUPnew);
		
		System.out.println(asdIUP.size());

		for (Integer nrp : asdIUP.keySet()){
			System.out.println(nrp);
		}

		System.out.println(asdIUP.containsValue("Ameera"));


	}

}
