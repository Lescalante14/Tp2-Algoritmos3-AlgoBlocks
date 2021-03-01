package edu.fiuba.algo3.vistas.botones.bloquesBotones;

import edu.fiuba.algo3.controladores.bloquesControladores.ControladorBloqueMoverArriba;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotonBloqueMoverArriba extends Button {

    public BotonBloqueMoverArriba(ControladorBloqueMoverArriba controladorBloqueMoverArriba) {
        Image bloqueMoverArriba = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/imagenes/bloque_mover_arriba.png");
        ImageView view = new ImageView(bloqueMoverArriba);
        view.setFitHeight(60);
        view.setPreserveRatio(true);
        super.setPrefSize(100,100);
        super.setGraphic(view);
        super.setOnAction(controladorBloqueMoverArriba);
    }

}
