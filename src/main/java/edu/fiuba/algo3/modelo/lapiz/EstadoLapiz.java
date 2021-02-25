package edu.fiuba.algo3.modelo.lapiz;

import edu.fiuba.algo3.modelo.posicion.Posicion;

public interface EstadoLapiz {

    void dibujarDesdeHasta(SectorDeDibujo sectorDeDibujo, Posicion posicionVieja, Posicion posicionNueva);

}
