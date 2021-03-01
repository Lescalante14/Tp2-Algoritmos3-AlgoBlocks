package edu.fiuba.algo3.vistas.botones.bloquesBotones;

import edu.fiuba.algo3.controladores.bloquesControladores.ControladorBloqueDesactivarLapiz;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotonBloqueDesactivarLapiz extends Button {

    public BotonBloqueDesactivarLapiz(ControladorBloqueDesactivarLapiz controladorBloqueDesactivarLapiz) {
        Image bloqueDesactivarLapiz = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/imagenes/bloque_lapiz_desactivado.png");
        ImageView view = new ImageView(bloqueDesactivarLapiz);
        view.setFitHeight(60);
        view.setPreserveRatio(true);
        super.setPrefSize(60,60);
        super.setGraphic(view);
        super.setOnAction(controladorBloqueDesactivarLapiz);
    }
}
