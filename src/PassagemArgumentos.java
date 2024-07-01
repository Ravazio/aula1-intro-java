public class PassagemArgumentos {
    /**
     * Duas tecnicas:
     * - por valor (somente os tipos primitivos)
     * - por referencia (somente os tipos de referencia)
     */

     public static int f(int a, int b){
        a++;
        b++;

        return a + b;
     }

     public static void passagemValor(){
        int a = 20;
        int b = 30;

        System.out.printf("a = %d, b = %d\n", a, b);

        f(a,b);

        System.out.printf("a = %d, b = %d\n", a, b); // observamos que o incremento ocorreu de forma local, não alterou o valor original
     }

     public static void printArray(int[] v){
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
     }

     public static void incrementa(int[] v){
        for (int i = 0; i < v.length; i++) {
            v[i]++;
        }
     }

     public static void passagemReferencia(){
        int[] v = {1, 2, 3, 4};

        printArray(v);
        incrementa(v);
        printArray(v); // observamos que ele altera o original que foi passado como referencia, pois Array é um tipo de referencia, devemos tomar cuidado!
     }

     public static void main(String[] args) {
        passagemValor();
        passagemReferencia();
     }
}
