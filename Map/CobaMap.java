package Map;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CobaMap {
    public static void main(String[] args) {
        countVote("ABBCDKLMDDDD");
    }
    public static void countVote(String v) {
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < v.length(); i++){
            char candidate = v.charAt(i);
            if (count.containsKey(candidate)){
                int vote = count.get(candidate);
                count.put(candidate, ++vote);
            }
            else {
                count.put(candidate, 1);
            }
        }
        Set<Character> candidates = new HashSet<>();
        candidates = count.keySet();
        int maxVote = 0;
        char winner = '0';
        for (char c : candidates ){
            int vote = count.get(c);
            if (vote > maxVote){
                maxVote = vote;
                winner = c;
            }
        }
        System.out.println(winner + " " + maxVote);
    }

}
