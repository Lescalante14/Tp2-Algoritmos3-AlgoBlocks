package edu.fiuba.algo3.controladores.bloquesControladores;

import edu.fiuba.algo3.modelo.personaje.Personaje;
import edu.fiuba.algo3.vistas.VistaSectorDibujo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;

public class ControladorReiniciarPosicion implements EventHandler<ActionEvent> {

    private final Image imagenInicial;
    private final VistaSectorDibujo vistaSectorDibujo;
    private Personaje personaje;

    public ControladorReiniciarPosicion(Personaje personaje, VistaSectorDibujo vistaSectorDibujo){
        this.personaje = personaje;
        this.vistaSectorDibujo = vistaSectorDibujo;
        this.imagenInicial = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/imagenes/personaje_lapiz_desactivado.png", 60,60,false, true);
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        personaje.reiniciarPosicion();
        vistaSectorDibujo.vaciarVistaPersonaje(personaje, imagenInicial);
    }

}
