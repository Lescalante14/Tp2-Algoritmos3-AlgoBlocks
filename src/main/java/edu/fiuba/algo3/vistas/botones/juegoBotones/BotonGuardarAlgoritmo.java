package edu.fiuba.algo3.vistas.botones.juegoBotones;

import edu.fiuba.algo3.controladores.algoritmoControladores.ControladorGuardarAlgoritmo;
import javafx.scene.control.Button;

public class BotonGuardarAlgoritmo extends Button {

    public BotonGuardarAlgoritmo(ControladorGuardarAlgoritmo controladorGuardarAlgoritmo){
        super.setText("Guardar");
        super.setDisable(true);
        super.setOnAction(controladorGuardarAlgoritmo);
        super.setId("boton-guardar");
    }

}
