package LinkedList;
public class LinkedListTest {

    public static void main(String[] args) {

         MyLinkedList<String> mll = new MyLinkedList<>();
         System.out.println(mll.isEmpty());
         mll.add("Faris");
         // mll.printAll();

         mll.add("Arsya");
         // mll.printAll();

         mll.add("Yubi");
         // mll.printAll();

         // mll.printFirst();

         mll.addAfter("Faris", "Tsanita");
         // mll.printAll();

         mll.printAll();
         System.out.println(mll.remove());
         mll.printAll();

    }

}
