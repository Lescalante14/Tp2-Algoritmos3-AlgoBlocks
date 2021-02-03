package edu.fiuba.algo3.modelo;

public class Lapiz {
    private EstadoLapiz estado;
    private SectorDeDibujo sectorDeDibujo;

    public Lapiz(){

        estado = new EstadoDesactivado();
        sectorDeDibujo = new SectorDeDibujo();
    }

    public EstadoLapiz estado(){
        return estado;
    }

    public void activar(){
        estado = new EstadoActivado();
    }
    public void desactivar(){
        estado = new EstadoDesactivado();
    }

    public boolean estaActivado(){
        return this.estado.estaActivado();
    }

    public void dibujarDesdeHasta(SectorDeDibujo sector, Posicion posicionVieja, Posicion posicionNueva) {



    }
}
