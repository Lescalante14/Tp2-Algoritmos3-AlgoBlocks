package edu.fiuba.algo3.modelo;

public class Personaje {

    private Lapiz lapiz;
    private Posicion posicion;
    
    public Personaje(){
        lapiz = new Lapiz();
        posicion = new Posicion(0,0);
    }

    public EstadoLapiz estadoLapiz(){
        return this.lapiz.estado();
    }

    public void activarLapiz(){
        this.lapiz.activar();

    }

    public void desactivarLapiz() {
        this.lapiz.desactivar();

    }

    public Posicion getPosicion(){
        return posicion;
    }


    public void mover(Posicion posicionNueva){
    	posicion = posicionNueva;
    }

/*
    public void moverADerecha() {
        Posicion posicionNueva = Posicion.derechaDe(posicion);
        realizarMovimiento(posicionNueva);
    }

    public void moverAIzquierda() {
        Posicion posicionNueva = Posicion.izquierdaDe(posicion);
        realizarMovimiento(posicionNueva);
    }

    public void moverArriba() {
        Posicion posicionNueva = Posicion.arribaDe(posicion);
        realizarMovimiento(posicionNueva);
    }

    public void moverAbajo() {
        Posicion posicionNueva = Posicion.abajoDe(posicion);
        realizarMovimiento(posicionNueva);
    }

    private void realizarMovimiento(Posicion posicionNueva){

        lapiz.dibujarDesdeHasta(posicion, posicionNueva);
        posicion = posicionNueva;

    }
*/
    public int totalDeCasillasPintadas() {
        return lapiz.totalDeCasillasPintadas();
    }
}
