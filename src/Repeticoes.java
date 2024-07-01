public class Repeticoes {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }

        int j = 0;

        while(j<5){
            System.out.println(j++);
        }

        int k = 0;

        do{
            System.out.println(k++);
        }while(k<5);
    }
}
