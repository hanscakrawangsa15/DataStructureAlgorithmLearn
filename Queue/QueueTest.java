package Queue;

public class QueueTest{
    public static void main(String[] args){
        QueueKu<String> queue = new QueueKu<>();
        queue.offer("Faris");
        queue.printAll();
        queue.offer("Hans");
        queue.offer("Isan");
        queue.printAll();

        queue.element();
        queue.printAll();


    }
}
