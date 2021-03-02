package edu.fiuba.algo3.controladores.bloquesControladores;


import edu.fiuba.algo3.controladores.ControladorEjecutarAlgoritmo;
import edu.fiuba.algo3.modelo.bloque.bloqueDeMovimiento.BloqueMoverArriba;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;

public class ControladorBloqueMoverArriba implements EventHandler<ActionEvent> {

    private final ControladorEjecutarAlgoritmo controladorAlgoritmo;
    private Image imagen;

    public ControladorBloqueMoverArriba(ControladorEjecutarAlgoritmo controladorAlgoritmo) {
        this.controladorAlgoritmo = controladorAlgoritmo;
        imagen = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/imagenes/personaje_arriba_lapiz_desactivado.png", 60,60,false, true);
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        controladorAlgoritmo.updateVistaAlgortimo("Bloque Mover Arriba");
        controladorAlgoritmo.agregarBloque(new BloqueMoverArriba());
        controladorAlgoritmo.setImagen(imagen);
    }
}
