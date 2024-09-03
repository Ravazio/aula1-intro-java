package queue;

public interface Queue {
    void enqueue(int value) throws QueueFullException;
    int dequeue() throws QueueEmptyException;
    int front() throws QueueEmptyException;
    int rear() throws QueueEmptyException;
    int size();
    int capacity();
    boolean isEmpty();
    boolean isFull();
}
