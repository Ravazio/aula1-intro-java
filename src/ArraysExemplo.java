public class ArraysExemplo{
    public static void main(String[] args){
        int[] numeros = {1, 2, 3, 4, 5};
        double[] decimais = {1.0, 2.0, 3.0, 4.0, 5.0};
        char[] caracteres = {'a', 'b', 'c'};

        System.out.println(numeros[2]);
        System.out.println(decimais[1]);
        System.out.println(caracteres[2]);

        System.out.println();

        System.out.println(numeros.length);
        System.out.println(decimais.length);
        System.out.println(caracteres.length);

        for(int i=0; i< numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
}