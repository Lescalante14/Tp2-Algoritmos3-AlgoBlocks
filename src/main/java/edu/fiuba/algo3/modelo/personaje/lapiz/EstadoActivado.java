package edu.fiuba.algo3.modelo.personaje.lapiz;

import edu.fiuba.algo3.modelo.personaje.Posicion;

public class EstadoActivado implements EstadoLapiz {


    public void dibujarDesdeHasta(SectorDeDibujo sectorDeDibujo, Posicion posicionVieja, Posicion posicionNueva){

        sectorDeDibujo.dibujarDesdeHasta(posicionVieja, posicionNueva);

    }

}



