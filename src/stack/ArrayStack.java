package stack;

public class ArrayStack implements Stack{

    private int[] elements;
    private int top;
    private int capacity;

    public ArrayStack(int capacity) throws InvalidCapacityException{
        if(capacity < 0){
            throw new InvalidCapacityException(capacity);
        }
        this.capacity = capacity;
        this.elements = new int[capacity];
        this.top = 0;
    }

    @Override
    public void push(int element) throws StackFullException{
        if(isFull()){
            throw new StackFullException(capacity, size());
        }
        elements[top++] = element;
    }

    @Override
    public int pop() throws StackEmptyException{
        if(isEmpty()){
            throw new StackEmptyException(capacity, size());
        }
        return elements[--top];
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public int top() throws StackEmptyException{
        if(isEmpty()){
            throw new StackEmptyException(capacity, size());
        }
        return elements[top-1];
    }

    @Override
    public int capacity() {
        return capacity;
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public boolean isFull() {
        return top == capacity;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Stack top -> [");
        for(int i = top - 1; i >=0; i--){
            sb.append(elements[i]);
            if(i > 0){
                sb.append(", ");
            }
        }        
        sb.append("]");

        return sb.toString();
    }
}