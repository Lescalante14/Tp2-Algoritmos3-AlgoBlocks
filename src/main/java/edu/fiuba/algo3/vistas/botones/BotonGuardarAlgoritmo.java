package edu.fiuba.algo3.vistas.botones;

import edu.fiuba.algo3.controladores.ControladorGuardarAlgoritmo;
import javafx.scene.control.Button;

public class BotonGuardarAlgoritmo extends Button {

    public BotonGuardarAlgoritmo(ControladorGuardarAlgoritmo controladorGuardarAlgoritmo){
        super.setText("Guardar");
        super.setDisable(true);
        super.setOnAction(controladorGuardarAlgoritmo);
        super.setId("boton-guardar");
    }

}
