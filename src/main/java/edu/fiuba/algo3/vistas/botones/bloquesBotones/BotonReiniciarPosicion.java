package edu.fiuba.algo3.vistas.botones.bloquesBotones;

import edu.fiuba.algo3.controladores.bloquesControladores.ControladorReiniciarPosicion;
import javafx.scene.control.Button;

public class BotonReiniciarPosicion extends Button {

    public BotonReiniciarPosicion(ControladorReiniciarPosicion controladorReiniciarPosicion){
        super.setText("Reiniciar Posición");
        super.setOnAction(controladorReiniciarPosicion);
        super.setId("boton-reiniciar-posicion");
    }
}
