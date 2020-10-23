package concessionaria;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FinestraAuto extends Stage {
    String modello;
    String marca;

    public FinestraAuto(String modello, String marca) {
        super();
        System.out.println(modello+" " +marca);
        this.marca = marca;
        this.modello = modello;

        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("altrafinestra.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.setTitle("Autovendita");
        this.setScene(new Scene(root, 600, 400));
        this.setResizable(false);
        this.show();
    }

}