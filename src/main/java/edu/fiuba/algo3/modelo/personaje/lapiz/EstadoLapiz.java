package edu.fiuba.algo3.modelo.personaje.lapiz;

import edu.fiuba.algo3.modelo.personaje.Posicion;

public interface EstadoLapiz {

    void dibujarDesdeHasta(SectorDeDibujo sectorDeDibujo, Posicion posicionVieja, Posicion posicionNueva);

}
