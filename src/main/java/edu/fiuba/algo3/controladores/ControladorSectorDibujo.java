package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.modelo.IObservador;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.lapiz.SectorDeDibujo;
import edu.fiuba.algo3.vistas.VistaPersonaje;
import javafx.util.Pair;

public class ControladorSectorDibujo implements IObservador {

    private SectorDeDibujo sectorDibujo;
    private VistaPersonaje vistaPersonaje;

    public ControladorSectorDibujo(SectorDeDibujo sectorDibujo, VistaPersonaje vistaPersonaje){
        this.sectorDibujo = sectorDibujo;
        this.vistaPersonaje = vistaPersonaje;
        sectorDibujo.agregarObservador(this);
    }

    @Override
    public void update() {
        Pair<Posicion, Posicion> casillasAPintar = sectorDibujo.getUltimoMovimiento();
        vistaPersonaje.pintarCasilla(casillasAPintar.getKey(), casillasAPintar.getValue());
    }
}
