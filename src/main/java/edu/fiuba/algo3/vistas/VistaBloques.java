package edu.fiuba.algo3.vistas;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

public class VistaBloques {

    private VBox bloques;

    public VistaBloques(VBox bloques){
        this.bloques = bloques;
    }

    public void dibujar() {
        ImageView imagen = new ImageView("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/fondoBloques.jpg");
        bloques.getChildren().add(imagen);
    }
}
