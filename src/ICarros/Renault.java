package ICarros;

public class Renault extends Carros{

    public Renault(String nome, int ano, double valor, String cor, int portas, double velocidade) {
        super(nome, ano, valor, cor, portas, velocidade);
    }

    @Override
    public void ligarMotor() {
        super.setVelocidade(0);
        super.ligarMotor();
        System.out.println("ignorar luzes do painel");
    }

    @Override
    public void frear() {
        super.setVelocidade(super.getVelocidade()-5);
        super.frear();
    }

    @Override
    public void acelerar() {
        super.setVelocidade(super.getVelocidade()+10);
        super.acelerar();
    }
}
