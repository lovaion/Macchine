package concessionaria;

import javafx.scene.image.Image;

public abstract class Marca {

    String nome;
    Image logo;
    String country;

    public Marca(String nome, String logo, String country){
        this.nome = nome;
        this.logo = new Image(logo);
        this.country = country;
    }

    public String toString(){
        return nome + " " + country;
    }

    public Image getImage(){
        return logo;
    }

}
