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

    public void moverADerecha() {
        Posicion posicionNueva = Posicion.derechaDe(posicion);
        //estado.dibujarDesdeHasta(posicion, posicionNueva);
        posicion = posicionNueva;
    }

    public void moverAIzquierda() {
        Posicion posicionNueva = Posicion.izquierdaDe(posicion);
        //estado.dibujarDesdeHasta(posicion, posicionNueva);
        posicion = posicionNueva;
    }

    public void moverArriba() {
        Posicion posicionNueva = Posicion.arribaDe(posicion);
        //estado.dibujarDesdeHasta(posicion, posicionNueva);
        posicion = posicionNueva;
    }

    public void moverAbajo() {
        Posicion posicionNueva = Posicion.abajoDe(posicion);
        //estado.dibujarDesdeHasta(posicion, posicionNueva);
        posicion = posicionNueva;
    }

}
