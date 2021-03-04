package edu.fiuba.algo3.vistas;

import edu.fiuba.algo3.controladores.algoritmoControladores.ControladorEjecutarAlgoritmo;
import edu.fiuba.algo3.controladores.algoritmoControladores.ControladorGuardarAlgoritmo;
import edu.fiuba.algo3.controladores.algoritmoControladores.ControladorVaciarAlgoritmo;
import edu.fiuba.algo3.modelo.personaje.Personaje;
import edu.fiuba.algo3.modelo.Algoritmo;
import javafx.scene.layout.GridPane;

public class VistaJuego {

    private final VistaSectorDibujo vistaSectorDibujo;
    private final VistaBloques vistaBloques;
    private final VistaAlgoritmo vistaAlgoritmo;
    private final GridPane contenedorTablero;

    public VistaJuego() {
        Personaje personaje = new Personaje();
        contenedorTablero = new GridPane();
        contenedorTablero.setGridLinesVisible(true);
        vistaSectorDibujo = new VistaSectorDibujo(personaje);
        Algoritmo algoritmo = new Algoritmo();
        vistaAlgoritmo = new VistaAlgoritmo();
        ControladorVaciarAlgoritmo controladorVaciarAlgoritmo = new ControladorVaciarAlgoritmo(algoritmo, vistaAlgoritmo);
        ControladorEjecutarAlgoritmo controladorEjecutarAlgoritmo = new ControladorEjecutarAlgoritmo(personaje, vistaSectorDibujo, algoritmo, vistaAlgoritmo);
        vistaBloques = new VistaBloques(controladorEjecutarAlgoritmo);
        ControladorGuardarAlgoritmo controladorGuardarAlgoritmo = new ControladorGuardarAlgoritmo(algoritmo, vistaAlgoritmo, vistaBloques, personaje);
        vistaAlgoritmo.setControladores(controladorEjecutarAlgoritmo, controladorVaciarAlgoritmo, controladorGuardarAlgoritmo);

    }

    public GridPane dibujarContenedores() {
        contenedorTablero.add(vistaSectorDibujo, 0,0);
        contenedorTablero.add(vistaBloques, 1, 0);
        contenedorTablero.add(vistaAlgoritmo, 2, 0);
        return contenedorTablero;
    }
}
