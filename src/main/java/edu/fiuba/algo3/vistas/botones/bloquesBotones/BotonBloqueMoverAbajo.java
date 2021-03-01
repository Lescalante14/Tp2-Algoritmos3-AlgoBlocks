package edu.fiuba.algo3.vistas.botones.bloquesBotones;

import edu.fiuba.algo3.controladores.bloquesControladores.ControladorBloqueMoverAbajo;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotonBloqueMoverAbajo extends Button {

    public BotonBloqueMoverAbajo(ControladorBloqueMoverAbajo controladorBloqueMoverAbajo) {
        Image bloqueMoverAbajo = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/imagenes/bloque_mover_abajo.png");
        ImageView view = new ImageView(bloqueMoverAbajo);
        view.setFitHeight(60);
        view.setPreserveRatio(true);
        super.setPrefSize(60,60);
        super.setGraphic(view);
        super.setOnAction(controladorBloqueMoverAbajo);
    }
}
