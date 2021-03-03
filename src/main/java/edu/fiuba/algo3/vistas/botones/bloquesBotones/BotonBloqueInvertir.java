package edu.fiuba.algo3.vistas.botones.bloquesBotones;

import edu.fiuba.algo3.controladores.bloquesControladores.ControladorBloqueInvertir;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotonBloqueInvertir extends Button {


    public BotonBloqueInvertir(ControladorBloqueInvertir controladorBloqueInvertir) {
        Image bloqueActivarLapiz = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/imagenes/bloque_grande_invertir.png");
        ImageView view = new ImageView(bloqueActivarLapiz);
        view.setFitHeight(90);
        view.setPreserveRatio(true);
        super.setPrefSize(100,100);
        super.setGraphic(view);
        super.setOnAction(controladorBloqueInvertir);
    }
}
