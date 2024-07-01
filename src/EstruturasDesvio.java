public class EstruturasDesvio {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i == 5){
                return; // termino abrupto, aborta a função nesse ponto
            }
            if(i == 6){
                break; // termino abrupto, aborta o loop nesse ponto, não executa o resto do código do laço for e não pula pra nenhuma próxima iteração
            }
            if(i % 2 == 0){
                continue; // não executa o resto do código do laço for, pula pra próxima iteração
            }
            System.out.print(i + " ");
        }
        System.out.println("O for terminou.");
    }
}