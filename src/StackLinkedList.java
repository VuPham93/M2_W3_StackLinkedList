import java.util.EmptyStackException;
import java.util.LinkedList;

public class StackLinkedList<T> {
    private  LinkedList<T> stack;
    
    public StackLinkedList() {
        stack = new LinkedList<T>();
    }
    
    public void push(T element) {
        stack.addFirst(element);
    }
    
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return stack.size();
    }
}
