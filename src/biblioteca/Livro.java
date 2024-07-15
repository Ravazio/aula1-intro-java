package biblioteca;

public class Livro {
    String titulo;
    String autor;
    int AnoPublicacao;
    String isbn;
    boolean emprestado;

    Livro(String titulo, String autor, int AnoPublicacao, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.AnoPublicacao = AnoPublicacao;
        this.isbn = isbn;
        emprestado = false;
    }

    void emprestar(){
        if(emprestado){
            throw new IllegalStateException("O livro já está emprestado.");
        }
        emprestado = true;
    }

    void devolver(){
        if(!emprestado){
            throw new IllegalStateException("O livro não está emprestado.");
        }
        emprestado = false;
    }

    boolean estaEmprestado(){
        return emprestado;
    }
}
