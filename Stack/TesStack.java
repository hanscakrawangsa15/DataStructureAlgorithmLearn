package Stack;
public class TesStack{
    public static void main(String[] args){
        StackAku<Pelanggan> stack = new StackAku<>();
        stack.add(new Pelanggan("Faris","Bang"));

        stack.printAll();
        System.out.println(stack.pop());
        stack.printAll();

    }
}