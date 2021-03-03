package edu.fiuba.algo3.vistas;

import edu.fiuba.algo3.controladores.ControladorEjecutarAlgoritmo;
import edu.fiuba.algo3.controladores.ControladorGuardarAlgoritmo;
import edu.fiuba.algo3.controladores.ControladorVaciarAlgoritmo;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.algortimo.Algoritmo;
import javafx.scene.layout.GridPane;

public class VistaJuego {

    private final VistaPersonaje vistaPersonaje;
    private final VistaBloques vistaBloques;
    private final VistaAlgoritmo vistaAlgoritmo;
    private final GridPane contenedorTablero;

    public VistaJuego() {
        Personaje personaje = new Personaje();
        contenedorTablero = new GridPane();
        contenedorTablero.setGridLinesVisible(true);
        vistaPersonaje = new VistaPersonaje(personaje);
        Algoritmo algoritmo = new Algoritmo();
        vistaAlgoritmo = new VistaAlgoritmo();
        ControladorVaciarAlgoritmo controladorVaciarAlgoritmo = new ControladorVaciarAlgoritmo(algoritmo, vistaAlgoritmo);
        ControladorEjecutarAlgoritmo controladorEjecutarAlgoritmo = new ControladorEjecutarAlgoritmo(personaje, vistaPersonaje, algoritmo, vistaAlgoritmo);
        vistaBloques = new VistaBloques(controladorEjecutarAlgoritmo);
        ControladorGuardarAlgoritmo controladorGuardarAlgoritmo = new ControladorGuardarAlgoritmo(algoritmo, vistaAlgoritmo, vistaBloques, personaje);
        vistaAlgoritmo.setControladores(controladorEjecutarAlgoritmo, controladorVaciarAlgoritmo, controladorGuardarAlgoritmo);

    }

    public GridPane dibujarContenedores() {
        contenedorTablero.add(vistaPersonaje, 0,0);
        contenedorTablero.add(vistaBloques, 1, 0);
        contenedorTablero.add(vistaAlgoritmo, 2, 0);
        return contenedorTablero;
    }
}
