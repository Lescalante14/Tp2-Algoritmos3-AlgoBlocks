package edu.fiuba.algo3.controladores.bloquesControladores;

import edu.fiuba.algo3.controladores.ControladorAlgoritmo;
import edu.fiuba.algo3.modelo.bloque.bloqueDeMovimiento.BloqueMoverIzquierda;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;

public class ControladorBloqueMoverIzquierda implements EventHandler<ActionEvent>  {

    private final ControladorAlgoritmo controladorAlgoritmo;
    private Image imagen;

    public ControladorBloqueMoverIzquierda(ControladorAlgoritmo controladorAlgoritmo) {
        this.controladorAlgoritmo = controladorAlgoritmo;
        imagen = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/imagenes/personaje_izquierda_lapiz_desactivado.png", 60,60,false, true);
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        controladorAlgoritmo.agregarBloque(new BloqueMoverIzquierda());
        controladorAlgoritmo.setImagen(imagen);
    }
}
