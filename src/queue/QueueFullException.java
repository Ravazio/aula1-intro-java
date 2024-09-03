package queue;

public class QueueFullException extends Exception {
    public QueueFullException(int capacity, int size){
        super(String.format("Queue is full. Size: %d. Capacity: %d", size, capacity));
    }
}