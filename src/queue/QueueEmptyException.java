package queue;

public class QueueEmptyException extends Exception{
    public QueueEmptyException(int capacity, int size){
        super(String.format("Queue is empty. Size: %d. Capacity: %d", size, capacity));
    }
}