package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.bloque.Bloque;
import javafx.geometry.Pos;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class SectorDeDibujo {

    private int tamanioX;
    private int tamanioY;
    private List <Pair> posicionesDibujadas;

    public SectorDeDibujo(){
        tamanioX = 10;
        tamanioY = 10;
        posicionesDibujadas = new ArrayList<>();
    }

    public int totalDeCasillasDibujadas() {
        return  this.posicionesDibujadas.size();
    }

    public void dibujarDesdeHasta(Posicion posicionVieja, Posicion posicionNueva) {
        Pair<Posicion, Posicion> tupla = new Pair(posicionVieja, posicionNueva);
        this.posicionesDibujadas.add(tupla);
    }
}
