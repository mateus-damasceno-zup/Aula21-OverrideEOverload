package ICarros;

public abstract class Carros implements ICarros{

    private String nome;
    private int ano;
    private double valor;
    private String cor;
    private int portas;
    private double velocidade;

    public Carros(String nome, int ano, double valor, String cor, int portas, double velocidade) {
        this.nome = nome;
        this.ano = ano;
        this.valor = valor;
        this.cor = cor;
        this.portas = portas;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }
    public double getVelocidade() {

            return velocidade;

    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public void ligarMotor() {

        System.out.println("Iniciando motor..." +
                "\n do carro "+ getNome() +
                "\n minha velocidade é: "+ getVelocidade());
    }

    @Override
    public void frear() {
            System.out.println("Freando... \n o carro "+ getNome());
            if (getVelocidade()>0){
                System.out.println("Minha velocidade está em: " + getVelocidade());
            }else{
                System.out.println("O "+getNome()+" está parado!!!!");
            }


    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando..." +
                "\n o carro "+ getNome()+
                "\n Minha velocidade está em: " + getVelocidade());
    }
}
