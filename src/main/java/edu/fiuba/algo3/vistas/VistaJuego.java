package edu.fiuba.algo3.vistas;

import edu.fiuba.algo3.controladores.ControladorAlgoritmo;
import edu.fiuba.algo3.modelo.Personaje;
import javafx.scene.layout.GridPane;


public class VistaJuego {

    private VistaPersonaje vistaPersonaje;
    private VistaBloques vistaBloques;
    private VistaAlgoritmo vistaAlgoritmo;
    private GridPane contenedorTablero;
    private Personaje personaje;

    public VistaJuego() {

        personaje = new Personaje();
        contenedorTablero = new GridPane();
        contenedorTablero.setGridLinesVisible(true); // QUITAR AL FINAL
        vistaPersonaje = new VistaPersonaje(personaje);
        ControladorAlgoritmo controladorAlgoritmo = new ControladorAlgoritmo(personaje, vistaPersonaje);
        vistaBloques = new VistaBloques(personaje, vistaPersonaje, controladorAlgoritmo);
        vistaAlgoritmo = new VistaAlgoritmo(controladorAlgoritmo);
    }

    public GridPane dibujarContenedores() {
        contenedorTablero.add(vistaPersonaje, 0,0);
        contenedorTablero.add(vistaBloques, 1, 0);
        contenedorTablero.add(vistaAlgoritmo, 2, 0);
        return contenedorTablero;
    }
}
