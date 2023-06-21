package ICarros;

public class Fiat extends Carros{

    public Fiat(String nome, int ano, double valor, String cor, int portas, double velocidade) {
        super(nome, ano, valor, cor, portas, velocidade);
    }

    @Override
    public void ligarMotor() {
        super.setVelocidade(3);
        super.ligarMotor();

    }

    @Override
    public void frear() {
        super.setVelocidade(super.getVelocidade()-6);
        super.frear();
    }

    @Override
    public void acelerar() {
        super.setVelocidade(super.getVelocidade()+12);
        super.acelerar();
    }
}
