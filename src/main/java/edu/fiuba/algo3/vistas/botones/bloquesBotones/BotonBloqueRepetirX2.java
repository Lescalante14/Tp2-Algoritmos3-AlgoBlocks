package edu.fiuba.algo3.vistas.botones.bloquesBotones;

import edu.fiuba.algo3.controladores.bloquesControladores.ControladorBloqueRepetirX2;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotonBloqueRepetirX2 extends Button {
    public BotonBloqueRepetirX2(ControladorBloqueRepetirX2 controladorBloqueRepetirX2) {
        Image bloqueRepetir = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/imagenes/bloque_repetir2.png");
        ImageView view = new ImageView(bloqueRepetir);
        view.setFitHeight(90);
        view.setPreserveRatio(true);
        super.setPrefSize(100,100);
        super.setGraphic(view);
        super.setOnAction(controladorBloqueRepetirX2);
    }
}
