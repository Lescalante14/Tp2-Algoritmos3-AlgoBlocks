package edu.fiuba.algo3.vistas.botones.bloquesBotones;

import edu.fiuba.algo3.controladores.bloquesControladores.ControladorBloqueActivarLapiz;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;;

public class BotonBloqueActivarLapiz extends Button {

    public BotonBloqueActivarLapiz(ControladorBloqueActivarLapiz controladorBloqueActivarLapiz) {
        Image bloqueActivarLapiz = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/imagenes/bloque_lapiz_activado.png");
        ImageView view = new ImageView(bloqueActivarLapiz);
        view.setFitHeight(60);
        view.setPreserveRatio(true);
        super.setPrefSize(60,60);
        super.setGraphic(view);
        super.setOnAction(controladorBloqueActivarLapiz);

    }
}
