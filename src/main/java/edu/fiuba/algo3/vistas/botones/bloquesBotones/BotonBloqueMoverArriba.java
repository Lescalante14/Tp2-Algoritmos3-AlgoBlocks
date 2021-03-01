package edu.fiuba.algo3.vistas.botones.bloquesBotones;

import edu.fiuba.algo3.controladores.bloquesControladores.ControladorBloqueMoverArriba;
import javafx.scene.control.Button;

public class BotonBloqueMoverArriba extends Button {

    public BotonBloqueMoverArriba(ControladorBloqueMoverArriba controladorBloqueMoverArriba) {
        /*Aniadir icono al boton, super.setPrefSize para el tamanio
        Image imagenOk = new Image(getClass().getResourceAsStream("recursos/ok.png"));
        botonEfecto.setGraphic(new ImageView(imagenOk));*/
        super.setText("Bloque Mover Arriba");
        super.setOnAction(controladorBloqueMoverArriba);
    }

}
