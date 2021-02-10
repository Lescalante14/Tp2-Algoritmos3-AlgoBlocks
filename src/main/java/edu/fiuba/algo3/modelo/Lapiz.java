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

    public void dibujarDesdeHasta(Posicion posicionVieja, Posicion posicionNueva) {

        estado.dibujarDesdeHasta(sectorDeDibujo, posicionVieja, posicionNueva);


    }

    public int totalDeCasillasPintadas() {
        return sectorDeDibujo.totalDeCasillasDibujadas();
    }
}
