package edu.fiuba.algo3.modelo;

public class SectorDeDibujo {

    private int tamanioX;
    private int tamanioY;
    private int casillasDibujadas;

    public SectorDeDibujo(){
        tamanioX = 10;
        tamanioY = 10;
        casillasDibujadas = 0;
    }

    public int tamanio() {
        int cuadriculas = this.tamanioX * this.tamanioY;
        return cuadriculas;
    }

    public int totalDeCasillasDibujadas() {
        return  this.casillasDibujadas;

    }

    public void dibujarDesdeHasta(Posicion posicionVieja, Posicion posicionNueva) {
        this.casillasDibujadas += 1;
    }
}
