package edu.fiuba.algo3.controladores.bloquesControladores;


import edu.fiuba.algo3.controladores.algoritmoControladores.ControladorEjecutarAlgoritmo;
import edu.fiuba.algo3.modelo.bloque.bloqueDeActivacion.BloqueDesactivarLapiz;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;

public class ControladorBloqueDesactivarLapiz implements EventHandler<ActionEvent> {

    private final ControladorEjecutarAlgoritmo controladorAlgoritmo;
    private Image imagen;

    public ControladorBloqueDesactivarLapiz(ControladorEjecutarAlgoritmo controladorAlgoritmo) {
        this.controladorAlgoritmo = controladorAlgoritmo;
        imagen = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/imagenes/personaje_lapiz_desactivado.png", 60,60,false, true);
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        controladorAlgoritmo.updateVistaAlgortimo("Bloque Desactivar Lapiz");
        controladorAlgoritmo.agregarBloque(new BloqueDesactivarLapiz());
        controladorAlgoritmo.setImagen(imagen);
    }
}
