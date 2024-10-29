package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class CobaQueue {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        findNumber(a);
    }
    public static void findNumber (int []a){
        Queue<Integer> q= new PriorityQueue<>();
        for (int i : a){
            q.add(Integer.valueOf(i));
            for (int j=0;j<q.size();j++){
                if  (q.peek()%2==0 ) q.poll();
            }
        }
        for (int v : q){
            System.out.print(v + " ");
        }

    }
}
