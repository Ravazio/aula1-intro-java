public class Recursividade {
    public static long fatorial(long n){
        if (n == 0){
            return 1;
        }
        return n * fatorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }    
}
