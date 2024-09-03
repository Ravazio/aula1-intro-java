package stack;

public class StackEmptyException extends Exception{
    public StackEmptyException(int capacity, int size){
        super(String.format("Stack is empty. Size: %d. Capacity: %d", size, capacity));
    }
}