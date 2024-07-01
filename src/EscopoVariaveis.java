public class EscopoVariaveis {
    // classe, qualquer bloco logico {}
    // a variavel que esta salva naquele escopo so vale nele
    public static void main(String[] args) {
        int a = 10;

        if (a == 10){
            int b = 20;
            System.out.printf("a = %d, b = %d\n", a, b);
        }
        //System.out.printf("a = %d, b = %d\n", a, b); // como b foi inicializado em outro bloco, ele e considerado nao criado aqui
    }
}
