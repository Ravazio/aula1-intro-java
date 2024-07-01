import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        System.out.print("Digite um valor booleano: ");
        boolean b = scanner.nextBoolean();
        System.out.print("Digite um número double: ");
        double d = scanner.nextDouble();
        System.out.print("Digite uma string: ");
        scanner.nextLine();
        String s = scanner.nextLine();

        scanner.close();

        System.out.printf("Inteiro lido: %d\n", numero);
        System.out.printf("Booleano lido: %b\n", b);
        System.out.printf("Double lido: %.4f\n", d);
        System.out.printf("String lida: %s\n", s);
    }
}
