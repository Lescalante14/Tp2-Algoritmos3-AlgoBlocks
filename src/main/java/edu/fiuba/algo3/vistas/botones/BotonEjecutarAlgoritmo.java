package edu.fiuba.algo3.vistas.botones;

import edu.fiuba.algo3.controladores.ControladorEjecutarAlgoritmo;
import javafx.scene.control.Button;

public class BotonEjecutarAlgoritmo extends Button {

    public BotonEjecutarAlgoritmo(ControladorEjecutarAlgoritmo controladorEjecutarAlgoritmo) {
        super.setText("Ejecutar");
        super.setOnAction(controladorEjecutarAlgoritmo);
    }

}
