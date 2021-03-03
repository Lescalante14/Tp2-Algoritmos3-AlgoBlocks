package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.modelo.IObservador;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.lapiz.SectorDeDibujo;
import edu.fiuba.algo3.vistas.VistaSectorDibujo;
import javafx.util.Pair;

public class ControladorSectorDibujo implements IObservador {

    private SectorDeDibujo sectorDibujo;
    private VistaSectorDibujo vistaSectorDibujo;

    public ControladorSectorDibujo(SectorDeDibujo sectorDibujo, VistaSectorDibujo vistaSectorDibujo){
        this.sectorDibujo = sectorDibujo;
        this.vistaSectorDibujo = vistaSectorDibujo;
        sectorDibujo.agregarObservador(this);
    }

    @Override
    public void update() {
        Pair<Posicion, Posicion> casillasAPintar = sectorDibujo.getUltimoMovimiento();
        vistaSectorDibujo.pintarCasilla(casillasAPintar.getKey(), casillasAPintar.getValue());
    }
}
