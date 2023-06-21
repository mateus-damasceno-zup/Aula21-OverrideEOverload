package ICarros;

public class Main {
    public static void main(String[] args) {
        Renault kwid = new Renault("Kwid",2023,20000,"Amaryellow",5,0);

        kwid.ligarMotor();
        kwid.acelerar();
        kwid.frear();
        kwid.acelerar();
        kwid.acelerar();
        kwid.frear();
        kwid.frear();
        kwid.frear();
        kwid.frear();
        kwid.frear();
        kwid.frear();


        Fiat toro = new Fiat("Toro",2022,100000,"preto",4,1000);

        toro.ligarMotor();
        toro.acelerar();
        toro.frear();
        toro.frear();
        toro.frear();
        toro.frear();

        Hyundai creta = new Hyundai("Creta",2023,200000,"vermlho ulala",4,0);

        creta.ligarMotor();
        creta.acelerar();
        creta.acelerar();
        creta.acelerar();
        creta.frear();
        creta.frear();
        creta.frear();
    }
}
