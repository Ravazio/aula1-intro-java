package stack;

public class InvalidCapacityException extends Exception {
    public InvalidCapacityException(int capacity){
        super(String.format("Invalid capacity: %d", capacity));
    }
}