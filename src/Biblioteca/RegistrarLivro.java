package Biblioteca;

public class RegistrarLivro extends Livro{

    public RegistrarLivro(String isbn, String nomeLivro, String genero, String autor) {
        super(isbn, nomeLivro, genero, autor);
    }

    public void registrarLivro(String isbn, String nomeLivro, String genero, String autor) {

        setIsbn(isbn);
        setNomeLivro(nomeLivro);
        setGenero(genero);
        setAutor(autor);
        System.out.println("O livro foi registrado com todos os atributos");

    }

    public void registrarLivro(String isbn, String nomeLivro, String genero) {
        setIsbn(isbn);
        setNomeLivro(nomeLivro);
        setGenero(genero);
        System.out.println("O livro foi registrado com o isbn "+ getIsbn()+" o nome "+getNomeLivro()+
                " e o gênero " +getGenero());
    }

    public void registrarLivro(String isbn, String nomeLivro) {
        setIsbn(isbn);
        setNomeLivro(nomeLivro);
        System.out.println("O livro foi registrado com o isbn "+getIsbn()+ " e o nome "+getNomeLivro());
    }

    public void registrarLivro(String isbn) {
        setIsbn(isbn);
        System.out.println("O livro foi registrado com o isbn " +getIsbn());
    }


}
