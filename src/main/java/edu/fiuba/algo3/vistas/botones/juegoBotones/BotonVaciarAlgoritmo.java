package edu.fiuba.algo3.vistas.botones.juegoBotones;

import edu.fiuba.algo3.controladores.algoritmoControladores.ControladorVaciarAlgoritmo;
import javafx.scene.control.Button;

public class BotonVaciarAlgoritmo extends Button {

    public BotonVaciarAlgoritmo(ControladorVaciarAlgoritmo controladorVaciarAlgoritmo){
        super.setText("Vaciar");
        super.setOnAction(controladorVaciarAlgoritmo);
        super.setId("boton-vaciar");
    }
}
