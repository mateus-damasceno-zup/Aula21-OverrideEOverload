package Biblioteca;

public abstract class Livro {
    private String isbn;
    private String nomeLivro;
    private String genero;
    private String autor;


    public Livro(String isbn, String nomeLivro, String genero, String autor) {
        this.isbn = isbn;
        this.nomeLivro = nomeLivro;
        this.genero = genero;
        this.autor = autor;

    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public abstract void registrarLivro(String isbn);

    public abstract void registrarLivro(String isbn, String nomeLivro);

    public abstract void registrarLivro(String isbn, String nomeLivro, String genero);

    public abstract void registrarLivro(String isbn, String nomeLivro, String genero, String autor);


}
