package edu.fiuba.algo3.controladores.bloquesControladores;

import javafx.scene.control.Alert;
import edu.fiuba.algo3.excepciones.BloquesDeSecuenciaAnidadosDeError;
import edu.fiuba.algo3.controladores.algoritmoControladores.ControladorEjecutarAlgoritmo;
import edu.fiuba.algo3.modelo.bloque.BloqueInvertir;
import edu.fiuba.algo3.modelo.bloque.BloqueRepeticion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControladorBloqueInvertir implements EventHandler<ActionEvent> {

    private final ControladorEjecutarAlgoritmo controladorEjecutarAlgoritmo;

    public ControladorBloqueInvertir(ControladorEjecutarAlgoritmo controladorEjecutarAlgoritmo) {

        this.controladorEjecutarAlgoritmo = controladorEjecutarAlgoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

		try{  
			controladorEjecutarAlgoritmo.activarBloqueTemporal(new BloqueInvertir());
		}catch(BloquesDeSecuenciaAnidadosDeError bloquesDeSecuenciaAnidadosDeError){

			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("Information Dialog");
			alert.setHeaderText(null);
			alert.setContentText("No se pueden anidar bloques de secuencia. ¡Guardá los bloques actuales en uno personalizado y anidalo!");
			alert.showAndWait();
			return;
		}

        controladorEjecutarAlgoritmo.updateVistaAlgortimo("-------------- [Inicio] Bloque Inversion --------------");
	
		}
}
