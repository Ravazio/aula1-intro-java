public class ExpressoesRelacionais {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        boolean c = a == b;
        boolean d = a != b;
        boolean e = a >= b;
        boolean f = a <= b;

        //boolean g = 0.1 + 0.2 == 0.3; // ERRADO, não é assim que se compara ponto flutuante!

        double g1 = 0.1;
        double g2 = 0.2;
        double g3 = 0.3;
        double g4 = g1 + g2;
        double erro = 1e10;

        boolean g = Math.abs(g4 - g3) < erro;  // Pontos Flutuantes são frações arredondadas, tem que se levar em conta uma margem de erro

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}
