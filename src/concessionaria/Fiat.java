package concessionaria;

public class Fiat extends Marca {
    public Fiat() {
        super("Fiat", Fiat.class.getResource("FiatLogo.png").toString(), "Italy");
    }
}
