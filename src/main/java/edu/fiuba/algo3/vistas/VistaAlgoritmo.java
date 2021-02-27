package edu.fiuba.algo3.vistas;

import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class VistaAlgoritmo{

    private BorderPane sectorAlgoritmo;

    public VistaAlgoritmo(BorderPane sectorAlgoritmo) {
        this.sectorAlgoritmo = sectorAlgoritmo;
    }

    public void dibujar() {

        this.sectorAlgoritmo.setTop(new Titulo("Sector de Algoritmos"));
        this.sectorAlgoritmo.setPadding(new Insets(25));
        HBox imagenHBox = new HBox();
        Image imagen = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/fondoVerde.jpg");
        BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        imagenHBox.setBackground(new Background(imagenDeFondo));
        sectorAlgoritmo.setCenter(imagenHBox);

    }
}
