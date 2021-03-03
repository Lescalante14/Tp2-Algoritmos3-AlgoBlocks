package edu.fiuba.algo3.controladores.bloquesControladores;

import edu.fiuba.algo3.controladores.algoritmoControladores.ControladorEjecutarAlgoritmo;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.bloque.BloquePersonalizado;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControladorBloquePerzonalizado implements EventHandler<ActionEvent> {

    private final ControladorEjecutarAlgoritmo controladorEjecutarAlgoritmo;
    private final BloquePersonalizado bloquePersonalizado;
    private final Personaje personaje;

    public ControladorBloquePerzonalizado(ControladorEjecutarAlgoritmo controladorEjecutarAlgoritmo, BloquePersonalizado bloquePersonalizado, Personaje personaje) {
        this.controladorEjecutarAlgoritmo = controladorEjecutarAlgoritmo;
        this.bloquePersonalizado = bloquePersonalizado;
        this.personaje = personaje;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        controladorEjecutarAlgoritmo.agregarBloque(bloquePersonalizado);
        controladorEjecutarAlgoritmo.updateVistaAlgortimo("Bloque Personalizado: "+bloquePersonalizado.getNombre());
    }
}
