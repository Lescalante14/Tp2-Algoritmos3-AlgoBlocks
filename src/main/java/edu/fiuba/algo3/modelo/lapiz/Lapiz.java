package edu.fiuba.algo3.modelo.lapiz;

import edu.fiuba.algo3.modelo.posicion.Posicion;

public class Lapiz {
    private EstadoLapiz estado;
    private SectorDeDibujo sectorDeDibujo;

    public Lapiz(){

        estado = new EstadoDesactivado();
        sectorDeDibujo = new SectorDeDibujo();
    }

    public void dibujarDesdeHasta(Posicion posicionVieja, Posicion posicionNueva) {

        estado.dibujarDesdeHasta(sectorDeDibujo, posicionVieja, posicionNueva);
    }

    public int totalDeCasillasPintadas() {
        return sectorDeDibujo.totalDeCasillasDibujadas();
    }

    public void cambiarEstado(EstadoLapiz nuevoEstado) {
        estado = nuevoEstado;
    }
}
