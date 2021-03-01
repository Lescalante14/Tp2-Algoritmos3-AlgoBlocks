package edu.fiuba.algo3.vistas.botones.bloquesBotones;

import edu.fiuba.algo3.controladores.bloquesControladores.ControladorBloqueMoverIzquierda;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotonBloqueMoverIzquierda extends Button {

    public BotonBloqueMoverIzquierda(ControladorBloqueMoverIzquierda controladorBloqueMoverIzquierda){
        Image imagenOk = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/imagenes/bloque_mover_izquierda.png", 60,60,false, true);
        super.setGraphic(new ImageView(imagenOk));
        super.setOnAction(controladorBloqueMoverIzquierda);
    }
}
