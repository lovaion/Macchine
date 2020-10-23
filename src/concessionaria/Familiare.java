package concessionaria;

public class Familiare {
    String nome;
    Double prezzo;
    Integer numeroPorte;
    Integer sedili;
    Boolean ibrida;

    String autoPic;

    public Familiare(String marca){
        switch(marca){
            case "Fiat":
                nome="Punto";
                prezzo=6000.0;
                numeroPorte=4;
                sedili=4;
                ibrida=false;
                autoPic = "Punto.png";
                break;
            case "Tesla":
                nome= "Model Y";
                prezzo=76000.0;
                numeroPorte=2;
                sedili=4;
                ibrida=true;
                autoPic ="modely.png";
                break;
            case "BMW":
                nome="Serie 5";
                prezzo=40000.0;
                numeroPorte=4;
                sedili=5;
                ibrida=false;
                autoPic="serie5.png";
                break;
        }
    }
}
