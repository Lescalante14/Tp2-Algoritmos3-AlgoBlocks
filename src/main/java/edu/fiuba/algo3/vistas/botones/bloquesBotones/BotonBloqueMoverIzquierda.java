package edu.fiuba.algo3.vistas.botones.bloquesBotones;

import edu.fiuba.algo3.controladores.bloquesControladores.ControladorBloqueMoverIzquierda;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotonBloqueMoverIzquierda extends Button {

    public BotonBloqueMoverIzquierda(ControladorBloqueMoverIzquierda controladorBloqueMoverIzquierda){
        Image bloqueMoverIzquierda = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/imagenes/bloque_mover_izquierda.png");
        ImageView view = new ImageView(bloqueMoverIzquierda);
        view.setFitHeight(60);
        view.setPreserveRatio(true);
        super.setPrefSize(60,60);
        super.setGraphic(view);
        super.setOnAction(controladorBloqueMoverIzquierda);
    }
}
