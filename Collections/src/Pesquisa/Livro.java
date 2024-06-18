package Pesquisa;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anopublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anopublicacao;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getAnoPublicacao() {
        return this.anoPublicacao;
    }    

    @Override
    public String toString() {
        return "{" +
            " Titulo='" + titulo + "'" +
            ", Autor='" + autor + "'" +
            ", anopublicacao='" + anoPublicacao + "'" +
            "}";
    }



}
