package Stack;

import java.util.Stack;

public class CobaStack {
    public static void main(String[] args) {
        int [] a = {4, 2, 6, 7, 9, 5, 10};
        findNumber(a);
    }
    public static void findNumber (int [] a){
        Stack<Integer> stack = new Stack<>();
        for (int v : a){
            while(!stack.empty() && stack.peek()>=v){
                stack.pop();
            }
            stack.push(v);
        }
        while(!stack.empty()){
            System.out.println(stack.pop() + " ");
        }
    }
}
