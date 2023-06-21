package ICarros;

public class Hyundai extends Carros{

    public Hyundai(String nome, int ano, double valor, String cor, int portas, double velocidade) {
        super(nome, ano, valor, cor, portas, velocidade);
    }

    @Override
    public void ligarMotor() {
        super.setVelocidade(5);
        super.ligarMotor();
    }

    @Override
    public void frear() {
        super.setVelocidade(super.getVelocidade()-2);
        super.frear();
    }

    @Override
    public void acelerar() {
        super.setVelocidade(super.getVelocidade()+15);
        super.acelerar();
    }
}
