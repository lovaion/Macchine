package concessionaria;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class AutoSpecController {
    @FXML
    public ImageView autoPic;
    @FXML
    public Label autoSpec;

    public void initialize(){
    //TODO ABSTRACT FATTORIA
        autoPic.setImage(new Image(Fiat.class.getResource("CYBERTRUCK.png").toString()));
    }
}
