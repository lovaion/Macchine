package concessionaria;

public class Sportiva {
    String nome;
    Double prezzo;
    Integer numeroPorte;
    Integer sedili;
    Boolean ibrida;

    String autoPic;

    public Sportiva(String marca){
        switch(marca){
            case "Fiat":
                nome="Coupè";
                autoPic = "coupe.pgn";
                prezzo=40000.0;
                numeroPorte=4;
                sedili=4;
                ibrida=false;
                break;
            case "Tesla":
                nome= "Model S";
                autoPic = "teslaModelS.pgn";
                prezzo=86000.0;
                numeroPorte=2;
                sedili=4;
                ibrida=true;
                break;
            case "BMW":
                nome="Serie 8";
                autoPic = "bmw8.pgn";
                prezzo=40000.0;
                numeroPorte=4;
                sedili=5;
                ibrida=false;
                break;
        }
    }
}
