package edu.fiuba.algo3.modelo;

public interface EstadoLapiz {

     boolean estaActivado();

    void dibujarDesdeHasta(SectorDeDibujo sectorDeDibujo, Posicion posicionVieja, Posicion posicionNueva);

}
