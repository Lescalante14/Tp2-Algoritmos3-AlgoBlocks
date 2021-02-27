package edu.fiuba.algo3.vistas.botones;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class BotonBloque extends Button {


    public BotonBloque(String nombre, Image imagen, EventHandler<ActionEvent> controlador){
        super.setText(nombre);
        BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        super.setBackground(new Background(imagenDeFondo));
        super.setOnAction(controlador);
    }

}
