package Funcionario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Funcionario {

    private String nome;
    private String dataAdimissao;
    private double salario;

    private static int identificador=0;

    public Funcionario() {

        this.identificador = identificador+1;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDataAdimissao(String dataAdimissao) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataVerificada = LocalDate.parse(dataAdimissao, dtf);

        LocalDate hoje = LocalDate.now();
        if(dataVerificada.compareTo(hoje)<=0){
            this.dataAdimissao=dataAdimissao;
        }else{
            System.out.println("impossivel adicionar data futura");
        }
    }
    public void setSalario(double salario) {

        if (salario>=700) {
            this.salario = salario;
        }else{
            System.out.println("salario precisa ser maior que 700");
        }
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "identificador= " + identificador +
                " nome='" + nome + '\'' +
                ", dataAdimissao='" + dataAdimissao + '\'' +
                ", salario=" + salario +
                '}';
    }
}
