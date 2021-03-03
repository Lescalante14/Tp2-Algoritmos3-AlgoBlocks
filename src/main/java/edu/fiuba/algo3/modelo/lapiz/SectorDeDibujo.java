package edu.fiuba.algo3.modelo.lapiz;
;
import edu.fiuba.algo3.modelo.IObservado;
import edu.fiuba.algo3.modelo.IObservador;
import edu.fiuba.algo3.modelo.Posicion;
import javafx.util.Pair;
import java.util.ArrayList;
import java.util.List;

public class SectorDeDibujo implements IObservado {

    private List <Pair> posicionesDibujadas;
    private ArrayList<IObservador> observadores;

    public SectorDeDibujo(){
        posicionesDibujadas = new ArrayList<>();
        observadores = new ArrayList<>();
    }

    public int totalDeCasillasDibujadas() {
        return  this.posicionesDibujadas.size();
    }

    public void dibujarDesdeHasta(Posicion posicionVieja, Posicion posicionNueva) {
        Pair<Posicion, Posicion> tupla = new Pair(posicionVieja, posicionNueva);
        this.posicionesDibujadas.add(tupla);
        notificarObservadores();
    }

    @Override
    public void agregarObservador(IObservador observador) {
        observadores.add(observador);
    }

    @Override
    public void notificarObservadores() {
        observadores.stream().forEach(observer -> observer.update());
    }

    public Pair getUltimoMovimiento() {
        return posicionesDibujadas.get(posicionesDibujadas.size()-1);
    }
}
