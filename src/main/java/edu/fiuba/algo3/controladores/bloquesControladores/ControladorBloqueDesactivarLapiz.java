package edu.fiuba.algo3.controladores.bloquesControladores;


import edu.fiuba.algo3.controladores.ControladorEjecutarAlgoritmo;
import edu.fiuba.algo3.modelo.bloque.bloqueDeActivacion.BloqueDesactivarLapiz;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;

public class ControladorBloqueDesactivarLapiz implements EventHandler<ActionEvent> {

    private final ControladorEjecutarAlgoritmo controladorEjecutarAlgoritmo;
    private Image imagen;

    public ControladorBloqueDesactivarLapiz(ControladorEjecutarAlgoritmo controladorEjecutarAlgoritmo) {
        this.controladorEjecutarAlgoritmo = controladorEjecutarAlgoritmo;
        imagen = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/imagenes/personaje_lapiz_desactivado.png", 60,60,false, true);
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        controladorEjecutarAlgoritmo.agregarBloque(new BloqueDesactivarLapiz());
        controladorEjecutarAlgoritmo.setImagen(imagen);
    }
}
