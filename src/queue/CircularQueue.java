package queue;

public class CircularQueue implements Queue{
    private int[] elements;
    private int front;
    private int back;
    private int size;
    private int capacity;

    public CircularQueue(int capacity) throws InvalidCapacityException{
        if(capacity < 0){
            throw new InvalidCapacityException(capacity);
        }
        this.capacity = capacity;
        this.size = 0;
        this.elements = new int[capacity];
        this.front = 0;
        this.back = 0;
    }

    @Override
    public void enqueue(int value) throws QueueFullException {
        if(isFull()){
            throw new QueueFullException(capacity, size());
        }
        elements[back] = value;
        back = (back + 1) % capacity;
        size++;
    }

    @Override
    public int dequeue() throws QueueEmptyException {
        if(isEmpty()){
            throw new QueueEmptyException(capacity, size());
        }
        int element = elements[front];
        front = (front + 1) % capacity;
        size--;
        return element;
    }

    @Override
    public int front() throws QueueEmptyException {
        if(isEmpty()){
            throw new QueueEmptyException(capacity, size());
        }
        return elements[front];
    }

    @Override
    public int rear() throws QueueEmptyException {
        // TODO
        /*
        if(isEmpty()){
            throw new QueueEmptyException(capacity, size());
        }
        return elements[back];
        */
        return 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int capacity() {
        return capacity;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == capacity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CircularQueue front -> [");
        if(size == 1){
            sb.append(elements[front]);
        }else if(size > 1){
            int i =0;
            int cur = front;

            while(i < size - 1){
                sb.append(elements[cur]);
                sb.append(", ");
                cur = (cur + 1) % capacity;
                i++;
            }
            sb.append(elements[cur]);
        }
        sb.append("] <- rear");
        return sb.toString();
    }
}