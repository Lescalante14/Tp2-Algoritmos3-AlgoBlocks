package edu.fiuba.algo3.vistas;

import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

public class VistaBloques {

    private VBox bloques;

    public VistaBloques(VBox bloques){
        this.bloques = bloques;
    }

    public VBox dibujar() {
        Image imagen = new Image("file:src/vista/resources/foto.jpg");
        Rectangle sectorBloques = new Rectangle(100, 600, Color.RED);
        bloques.setBackground(new Background(new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT)));
        bloques.getChildren().add(sectorBloques);
        return bloques;
    }
}
