package edu.fiuba.algo3.modelo.lapiz;

import edu.fiuba.algo3.modelo.posicion.Posicion;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class SectorDeDibujo {

    private List <Pair> posicionesDibujadas;

    public SectorDeDibujo(){
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
