package queue;

public class Main {
    public static void main(String[] args) {
        try {
            CircularQueue queue = new CircularQueue(5);

            System.out.println(queue);
            for(int i = 0; i < 5; i++){
                queue.enqueue(i+1);
                System.out.println(queue);
            }
            // queu.enqueue(10);
            while(!queue.isEmpty()){
                System.out.println("Dequeuing: " + queue.dequeue());
                System.out.println(queue);
            }
            // queue.dequeue();
        } catch(QueueFullException e){
            e.printStackTrace();
        } catch(InvalidCapacityException e){
            e.printStackTrace();
        } catch (QueueEmptyException e) {
            e.printStackTrace();
        }
    }
}
