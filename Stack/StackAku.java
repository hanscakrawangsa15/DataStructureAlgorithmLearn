package Stack;

public class StackAku<E> extends MyLinkedList<E> {
    public void push(E value) {
        add(value);
    }

    public E pop() {
        return remove();
    }

    public E peek() { // melihat element teratas
        if (isEmpty()) {
            return null;
        } else {
            return header.value;
        }
    }
}