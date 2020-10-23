package concessionaria;

public class Lavorativa {
    String nome;
    Double prezzo;
    Integer numeroPorte;
    Integer sedili;
    Boolean ibrida;
    String autoPic;


    public Lavorativa(String marca) {
        switch(marca){
            case "Fiat":
                nome="Nuova 500XL";
                autoPic = "500XL.png";
                prezzo=10000.0;
                numeroPorte=4;
                sedili=4;
                ibrida=false;
                break;
            case "Tesla":
                nome= "Cyber-Truck";
                autoPic = "CYBERTRUCK.png";
                prezzo=86000.0;
                numeroPorte=2;
                sedili=4;
                ibrida=true;
                break;
            case "BMW":
                nome="X3";
                autoPic = "X3.png";
                prezzo=30000.0;
                numeroPorte=4;
                sedili=5;
                ibrida=false;
                break;
        }
    }
}
