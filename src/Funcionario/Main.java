package Funcionario;



public class Main {
    public static void main(String[] args) {
        Funcionario jujuba = new Funcionario();

        jujuba.setNome("Jujuba");
        jujuba.setDataAdimissao("23/05/2024");
        jujuba.setSalario(700);
        System.out.println(jujuba);

        Funcionario kiwi = new Funcionario();
        kiwi.setNome("Kiwi");
        kiwi.setSalario(80000);
        kiwi.setDataAdimissao("22/02/2022");
        System.out.println(kiwi);

        Funcionario mateus = new Funcionario();
        mateus.setNome("mateus");
        mateus.setSalario(Double.MAX_VALUE);
        mateus.setDataAdimissao("02/05/2023");
        System.out.println(mateus);

        mateus.setSalario(699);
        mateus.setDataAdimissao("31/12/2033");


    }
}
