package edu.fiuba.algo3.vistas;

import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class VistaAlgoritmo{

    private GridPane sectorAlgoritmo;

    public VistaAlgoritmo(GridPane sectorAlgoritmo) {
        this.sectorAlgoritmo = sectorAlgoritmo;
    }

    public void dibujar() {
        ImageView imagen = new ImageView("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/fondoVerde.jpg");
        sectorAlgoritmo.getChildren().add(imagen);
    }
}
