package concessionaria;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class MainController {
    @FXML
    public ImageView logoFiat;
    @FXML
    public ImageView logoTesla;
    @FXML
    public ImageView logoBMW;

    public String chosenLogo="";
    public String chosenModel="";
    @FXML
    public Label work;
    @FXML
    public Label sport;
    @FXML
    public Label family;

    FinestraAuto fa;
    public void initialize(){
        Marca fiat = new Fiat();
        Marca tesla = new Tesla();
        Marca bmw = new BMW();

        logoFiat.setImage(fiat.getImage());
        logoTesla.setImage(tesla.getImage());
        logoBMW.setImage(bmw.getImage());
    }

    public void showFiatModels(MouseEvent mouseEvent) {
        logoFiat.setOpacity(1);
        logoTesla.setOpacity(0.3);
        logoBMW.setOpacity(0.3);
        chosenLogo = "Fiat";
        checkString();
    }

    public void showTeslaModels(MouseEvent mouseEvent) {
        logoFiat.setOpacity(0.3);
        logoTesla.setOpacity(1);
        logoBMW.setOpacity(0.3);
        chosenLogo = "Tesla";
        checkString();
    }

    public void showBMWModels(MouseEvent mouseEvent) {
        logoFiat.setOpacity(0.3);
        logoTesla.setOpacity(0.3);
        logoBMW.setOpacity(1);
        chosenLogo = "BMW";
        checkString();
    }


    public void showFamily(MouseEvent mouseEvent) {
        family.setTextFill(Color.web("#b00026"));
        work.setTextFill(Color.web("#000000"));
        sport.setTextFill(Color.web("#000000"));
        chosenModel ="Family";
        checkString();

    }

    public void showSport(MouseEvent mouseEvent) {
        family.setTextFill(Color.web("000000"));
        work.setTextFill(Color.web("#000000"));
        sport.setTextFill(Color.web("#b00026"));
        chosenModel ="Sport";
        checkString();

    }

    public void showWork(MouseEvent mouseEvent) {
        family.setTextFill(Color.web("#000000"));
        work.setTextFill(Color.web("#b00026"));
        sport.setTextFill(Color.web("#000000"));
        chosenModel ="Work";
         checkString();

    }

    private void checkString(){ // true se sono entrambi diversi
        if (!chosenModel.equals("") && !chosenLogo.equals("")) {
            logoFiat.setOpacity(1);
            logoTesla.setOpacity(1);
            logoBMW.setOpacity(1);
            family.setTextFill(Color.web("#000000"));
            work.setTextFill(Color.web("#000000"));
            sport.setTextFill(Color.web("#000000"));
            fa = new FinestraAuto(chosenModel, chosenLogo);
            chosenLogo=chosenModel="";
        }

    }
}
