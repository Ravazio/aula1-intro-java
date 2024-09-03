package stack;

public class Main {
    public static void main(String[] args) {
        try {
            Stack stack = new ArrayStack(5);

            System.out.println(stack);
            for(int i = 0; i < 5; i++){
                System.out.println("Inserting " + (i+1));
                stack.push(i + 1);
                System.out.println(stack);
            }
            //stack.push(10);
            while(!stack.isEmpty()){
                System.out.println("Removendo: " + stack.pop());
                System.out.println(stack);
            }
            //stack.pop();
        } catch (InvalidCapacityException e) {
            e.printStackTrace();
        } catch (StackFullException e) {
            e.printStackTrace();
        } catch (StackEmptyException e) {
            e.printStackTrace();
        }
    }
}
