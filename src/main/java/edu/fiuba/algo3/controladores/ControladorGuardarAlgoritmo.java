package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.excepciones.AlgoritmoVacioError;
import edu.fiuba.algo3.excepciones.NombreVacioError;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.ValidaAlgoritmo;
import edu.fiuba.algo3.modelo.algortimo.Algoritmo;
import edu.fiuba.algo3.modelo.bloque.BloquePersonalizado;
import edu.fiuba.algo3.vistas.VistaAlgoritmo;
import edu.fiuba.algo3.vistas.VistaBloques;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;

import java.util.Optional;

public class ControladorGuardarAlgoritmo implements EventHandler<ActionEvent> {

    private final Algoritmo algoritmo;
    private final VistaAlgoritmo vistaAlgoritmo;
    private final VistaBloques vistaBloques;
    private final Personaje personaje;

    public ControladorGuardarAlgoritmo(Algoritmo algoritmo, VistaAlgoritmo vistaAlgoritmo, VistaBloques vistaBloques, Personaje personaje){
        this.algoritmo = algoritmo;
        this.vistaAlgoritmo = vistaAlgoritmo;
        this.vistaBloques = vistaBloques;
        this.personaje = personaje;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        TextInputDialog dialog = new TextInputDialog("");
        dialog.setTitle("Nombre de tu algoritmo");
        dialog.setHeaderText("Algoritmo Personalizado");
        dialog.setContentText("Nombre de tu algoritmo:");

        Optional<String> result = dialog.showAndWait();
        try{
            if (result.isPresent()){
                BloquePersonalizado bloquePersonalizado = algoritmo.guardaAlgoritmoPersonalizado(result.get());
                vistaBloques.agregarBloquePersonalizado(bloquePersonalizado, personaje);
                vistaAlgoritmo.vaciarVistaAlgoritmo();
                vistaAlgoritmo.desactivarBotonGuardado(true);
            }
        }
        catch(NombreVacioError nombreVacioError) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Nombre de tu algoritmo vacio");
            alert.setHeaderText(null);
            alert.setContentText("Nombre vacío, agrega al menos un caracter");
            alert.showAndWait();
        }
    }

}
