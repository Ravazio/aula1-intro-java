package biblioteca;
import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> acervo;

    Biblioteca(){
        acervo = new ArrayList<Livro>();
    }

    void adicionaLivro(Livro livro){
        acervo.add(livro);
    }

    void removeLivroPeloIsbn(String isbn){
        for (Livro livro : acervo) {
            if(isbn.equals(livro.isbn)){
                acervo.remove(livro);
            }
        }
    }

    ArrayList<Livro> listaEmprestados(){
        // ArrayList<Livro> emprestados = new ArrayList<Livro>();
        // ou então 
        // ArrayList<Livro> emprestados = new ArrayList<>(); -> fez inferência na atribuição de tipos no <>
        // Da pra fazer uma inferência de tipos aqui, ele não precisa ficar repetindo todo o código de inferência, ele já identifica pra que é
        var  emprestados = new ArrayList<Livro>();

        // Usaremos a inferência aqui também
        // for (Livro livro : acervo) {
        for (var livro : acervo) {
            if(livro.estaEmprestado()){
                emprestados.add(livro);
            }
        }
        return emprestados;
    }

    ArrayList<Livro> listaDisponiveis(){
        var disponiveis = new ArrayList<Livro>();

        for (var livro : acervo) {
            if(!livro.estaEmprestado()){
                disponiveis.add(livro);
            }
        }
        return disponiveis;
    }
}
