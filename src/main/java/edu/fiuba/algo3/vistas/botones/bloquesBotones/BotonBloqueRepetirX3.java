package edu.fiuba.algo3.vistas.botones.bloquesBotones;

import edu.fiuba.algo3.controladores.bloquesControladores.ControladorBloqueRepetirX3;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class BotonBloqueRepetirX3 extends Button {

    public BotonBloqueRepetirX3(ControladorBloqueRepetirX3 controladorBloqueRepetirX3) {
        Image bloqueMoverIzquierda = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/imagenes/bloque_repetir3.png");
        ImageView view = new ImageView(bloqueMoverIzquierda);
        view.setFitHeight(90);
        view.setPreserveRatio(true);
        super.setPrefSize(100,100);
        super.setGraphic(view);
        super.setOnAction(controladorBloqueRepetirX3);
    }
}
