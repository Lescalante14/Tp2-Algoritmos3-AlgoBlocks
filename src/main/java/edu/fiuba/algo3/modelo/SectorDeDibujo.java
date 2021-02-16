package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.bloque.Bloque;

import java.util.ArrayList;
import java.util.List;

public class SectorDeDibujo {

    private int tamanioX;
    private int tamanioY;
    private List <Posicion> posicionesDibujadas;

    public SectorDeDibujo(){
        tamanioX = 10;
        tamanioY = 10;
        posicionesDibujadas = new ArrayList<>();
    }

    public int totalDeCasillasDibujadas() {
        return  this.posicionesDibujadas.size();
    }

    public void dibujarDesdeHasta(Posicion posicionVieja, Posicion posicionNueva) {
        this.posicionesDibujadas.add(posicionVieja);
    }
}
