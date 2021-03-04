package edu.fiuba.algo3.controladores.bloquesControladores;

import javafx.scene.control.Alert;
import edu.fiuba.algo3.excepciones.BloquesDeSecuenciaAnidadosDeError;
import edu.fiuba.algo3.controladores.algoritmoControladores.ControladorEjecutarAlgoritmo;
import edu.fiuba.algo3.modelo.bloque.BloqueRepeticion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControladorBloqueRepetirX2 implements EventHandler<ActionEvent> {

    private final ControladorEjecutarAlgoritmo controladorEjecutarAlgoritmo;

    public ControladorBloqueRepetirX2(ControladorEjecutarAlgoritmo controladorEjecutarAlgoritmo) {
        this.controladorEjecutarAlgoritmo = controladorEjecutarAlgoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
     	
		try{
		
			controladorEjecutarAlgoritmo.activarBloqueTemporal(new BloqueRepeticion(2));
		
		}catch(BloquesDeSecuenciaAnidadosDeError bloquesDeSecuenciaAnidadosDeError){
			
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("Information Dialog");
			alert.setHeaderText(null);
			alert.setContentText("No se puede anidar bloques de secuencia. Crea un personalizado e intentelo de nuevo !");
			alert.showAndWait();
			return;
		}

		controladorEjecutarAlgoritmo.updateVistaAlgortimo("-------------- [Inicio] Bloque Repeticion x2 --------------");
		
		}
}
