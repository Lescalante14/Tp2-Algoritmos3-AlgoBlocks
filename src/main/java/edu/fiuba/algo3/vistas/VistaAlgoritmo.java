package edu.fiuba.algo3.vistas;

import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class VistaAlgoritmo extends BorderPane{

    public VistaAlgoritmo() {
        this.setTop(new Titulo("Sector de Algoritmos"));
        this.setPadding(new Insets(25));
    }

    public void dibujar(){
        HBox imagenHBox = new HBox();
        Image imagen = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/fondoVerde.jpg");
        BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        imagenHBox.setBackground(new Background(imagenDeFondo));
        this.setCenter(imagenHBox);
    }
}
