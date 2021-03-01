package edu.fiuba.algo3.vistas.botones.bloquesBotones;

import edu.fiuba.algo3.controladores.bloquesControladores.ControladorBloquePerzonalizado;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotonBloquePersonalizado extends Button {

    public BotonBloquePersonalizado(ControladorBloquePerzonalizado controladorBloquePerzonalizado) {
        Image bloquePerzonalizado = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/imagenes/bloque_personalizado.png");
        ImageView view = new ImageView(bloquePerzonalizado);
        view.setFitHeight(60);
        view.setPreserveRatio(true);
        super.setPrefSize(60,60);
        super.setGraphic(view);
        super.setOnAction(controladorBloquePerzonalizado);
    }
}
