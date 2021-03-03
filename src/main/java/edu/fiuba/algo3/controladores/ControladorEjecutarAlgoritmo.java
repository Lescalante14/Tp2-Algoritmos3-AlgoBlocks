package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.excepciones.AlgoritmoVacioError;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.ValidaAlgoritmo;
import edu.fiuba.algo3.modelo.algortimo.Algoritmo;
import edu.fiuba.algo3.modelo.bloque.Bloque;
import edu.fiuba.algo3.modelo.bloque.bloqueDeActivacion.BloqueActivarLapiz;
import edu.fiuba.algo3.vistas.VistaAlgoritmo;
import edu.fiuba.algo3.vistas.VistaPersonaje;
import edu.fiuba.algo3.vistas.botones.BotonGuardarAlgoritmo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;


public class ControladorEjecutarAlgoritmo implements EventHandler<ActionEvent> {

    private final VistaPersonaje vistaPersonaje;
    private final Personaje personaje;
    private final Algoritmo algortimo;
    private final VistaAlgoritmo vistaAlgoritmo;
    private Image imagen;

    public ControladorEjecutarAlgoritmo(Personaje personaje, VistaPersonaje vistaPersonaje, Algoritmo algoritmo, VistaAlgoritmo vistaAlgoritmo){
        this.personaje = personaje;
        this.vistaPersonaje = vistaPersonaje;
        this.algortimo = algoritmo;
        this.vistaAlgoritmo = vistaAlgoritmo;
        this.imagen = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/imagenes/personaje_lapiz_desactivado.png", 60,60,false, true);
    }

    public void handle(ActionEvent actionEvent) {
        try{
            algortimo.ejecutarAlgoritmo(personaje);
        }
        catch(AlgoritmoVacioError algoritmoVacioError) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText(null);
            alert.setContentText("Algoritmo vacío, agrega al menos un bloque para ejecutar");

            alert.showAndWait();
        }
        vistaPersonaje.update(this.imagen);

    }

    public void setImagen(Image imagen){
        this.imagen = imagen;
    }

    public void agregarBloque(Bloque bloque) {
        algortimo.agregarBloque(bloque);
        vistaAlgoritmo.desactivarBotonGuardado(false);

    }

    public void updateVistaAlgortimo(String nombreBloque) {
       vistaAlgoritmo.update(nombreBloque);
    }
}
