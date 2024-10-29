package Queue;
public class QueueKu<E> extends MyLinkedList<E>{
    Node <E> tail;
    QueueKu(){
        tail = super.header;
    }
    public boolean offer(E value){
        boolean returnValue = false;

        Node<E> newNode = new Node<E>(value, null);
        if (isEmpty()){
            tail = newNode;
            header = newNode;
            returnValue = true;
        }
        else{
            tail.next = newNode;
            tail = newNode;
            returnValue = true;
        }
        return returnValue;
    }
    public E element(){
        E returnValue = null;
        if (!isEmpty()) {
            returnValue = header.value;
        }
        return returnValue;
    }
}
