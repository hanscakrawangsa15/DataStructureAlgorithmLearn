import java.util.LinkedList;

public class LinkedList2{
    public static void main(String[] args) {
        int[] array = {1, 5, 7, 1};
        int index = 1;
        change(array, index);
    }
    public static LinkedList<Integer> change(int []a, int i){
//declare the linkedlist
//CP#1
        LinkedList<Integer> list = new LinkedList<>();
//add the element of array to the linkedlist
        for(int v:a) {
//CP#2
            list.add(v);
        }
//check whether the value before marker index
//not less than the value in index i
//if it happens, change the value with random integer less than
//the value in index i
//CP#3
        for(int j=0;j<i;j++){
//CP#4
            if (list.get(j)>= list.get(i)){
//use (int) Math.random()*list.get(i));
//CP#5
                list.set(j,(int) Math.random()*list.get(i));
            }
        }
//print the value in the linkedlist and return the list
//CP#6
        for(int v:list){
            System.out.print(v+" ");
        }
//CP#7
        return list;
    }

}

