package stack;

public interface Stack {
    void push(int element) throws StackFullException;
    int pop() throws StackEmptyException;
    int size();
    int top() throws StackEmptyException;
    int capacity();
    boolean isEmpty();
    boolean isFull();
}