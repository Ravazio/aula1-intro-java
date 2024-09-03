package stack;

public class StackFullException extends Exception {
    public StackFullException(int capacity, int size){
        super(String.format("Stack is full. Size: %d. Capacity: %d", size, capacity));
    }
}