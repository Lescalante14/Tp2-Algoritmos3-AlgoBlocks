package edu.fiuba.algo3.modelo.lapiz;

import edu.fiuba.algo3.modelo.Posicion;

public class EstadoActivado implements EstadoLapiz {


    public void dibujarDesdeHasta(SectorDeDibujo sectorDeDibujo, Posicion posicionVieja, Posicion posicionNueva){

        sectorDeDibujo.dibujarDesdeHasta(posicionVieja, posicionNueva);

    }

}



