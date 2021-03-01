package edu.fiuba.algo3.vistas.botones.bloquesBotones;

import edu.fiuba.algo3.controladores.bloquesControladores.ControladorBloqueMoverDerecha;
import javafx.scene.control.Button;

public class BotonBloqueMoverDerecha extends Button {

    public BotonBloqueMoverDerecha(ControladorBloqueMoverDerecha controladorBloqueMoverDerecha){
        super.setText("Bloque Mover Derecha");
        super.setOnAction(controladorBloqueMoverDerecha);
    }

}
