package edu.fiuba.algo3.vistas;

import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class VistaAlgoritmo{

    private GridPane sectorAlgoritmo;

    public VistaAlgoritmo(GridPane sectorAlgoritmo) {
        this.sectorAlgoritmo = sectorAlgoritmo;
    }

    public void dibujar() {

        Image imagen = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/fondoVerde.jpg");
        BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        sectorAlgoritmo.setBackground(new Background(imagenDeFondo));

        //sectorAlgoritmo.getChildren().add();
    }
}
