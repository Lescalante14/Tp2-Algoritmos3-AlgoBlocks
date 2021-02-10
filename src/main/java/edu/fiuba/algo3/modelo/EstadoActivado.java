package edu.fiuba.algo3.modelo;

public class EstadoActivado implements EstadoLapiz {

    public void dibujar() {

    }

    public boolean estaActivado(){
        return true;
    }

    public void dibujarDesdeHasta(SectorDeDibujo sectorDeDibujo, Posicion posicionVieja, Posicion posicionNueva){

        sectorDeDibujo.dibujarDesdeHasta(posicionVieja, posicionNueva);

    }

}



