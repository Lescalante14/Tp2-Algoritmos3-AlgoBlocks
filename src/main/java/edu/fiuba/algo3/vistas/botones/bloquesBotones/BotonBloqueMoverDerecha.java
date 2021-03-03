package edu.fiuba.algo3.vistas.botones.bloquesBotones;

import edu.fiuba.algo3.controladores.bloquesControladores.ControladorBloqueMoverDerecha;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotonBloqueMoverDerecha extends Button {

    public BotonBloqueMoverDerecha(ControladorBloqueMoverDerecha controladorBloqueMoverDerecha){
        Image bloqueMoverDerecha = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/imagenes/bloque_mover_derecha.png");
        ImageView view = new ImageView(bloqueMoverDerecha);
        view.setFitHeight(60);
        view.setPreserveRatio(true);
        super.setPrefSize(100,100);
        super.setGraphic(view);
        super.setOnAction(controladorBloqueMoverDerecha);
    }

}
