package edu.fiuba.algo3.modelo;

public class Personaje {

    private Lapiz lapiz;
    private Posicion posicion;
    
    public Personaje(){
        lapiz = new LapizActivado();
        posicion = new Posicion();
    }

    public boolean estadoLapiz(){
        return this.lapiz.estado();
    }

/*    public void activarLapiz(){
        this.lapiz.activar();

    }

    public void desactivarLapiz() {
        this.lapiz.desactivar();
	}
*/
	public void cambiarLapiz(Lapiz unLapiz){
		lapiz = unLapiz;
	}

    public Posicion getPosicion(){
        return posicion;
    }


    public void mover(Posicion posicionNueva){
        //lapiz.dibujar(posicionNueva);
		posicion.sumar(posicionNueva);
    }

	public Lapiz obtenerLapiz(){
			return lapiz;
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

    public int totalDeCasillasPintadas() {
        return lapiz.totalDeCasillasPintadas();
    }*/
}
