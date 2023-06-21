package Biblioteca;

public class BibliotecaTeste {
    public static void main(String[] args) {

        RegistrarLivro autoDaCompadecida = new RegistrarLivro("BCAVCASB","O auto da compadecida","fantasia","Ariano Suassuna");
        autoDaCompadecida.registrarLivro(autoDaCompadecida.getIsbn());

        RegistrarLivro poemasParaBrincar = new RegistrarLivro("12334sfasd","Poemas para Brincar","poesia","Paes");
        poemasParaBrincar.registrarLivro(poemasParaBrincar.getIsbn(), poemasParaBrincar.getNomeLivro());

        RegistrarLivro anjoDaMorte = new RegistrarLivro("SS","O anjo da Morte","aventura","Pedro bandeira");
        anjoDaMorte.registrarLivro(anjoDaMorte.getIsbn(), anjoDaMorte.getNomeLivro(),anjoDaMorte.getGenero());

        RegistrarLivro arteDaGuerra = new RegistrarLivro("00001","A arte da Guerra","auto ajuda","sun Tzu");
        arteDaGuerra.registrarLivro(arteDaGuerra.getIsbn(),arteDaGuerra.getNomeLivro(),arteDaGuerra.getGenero(),arteDaGuerra.getAutor());

    }
}
