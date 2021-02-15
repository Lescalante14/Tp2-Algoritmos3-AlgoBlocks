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

	public void cambiarLapiz(Lapiz unLapiz){
		lapiz = unLapiz;
	}

    public Posicion getPosicion(){
        return posicion;
    }


    public void mover(Posicion posicionNueva){
		posicion.sumar(posicionNueva);
    }

	public Lapiz obtenerLapiz(){
			return lapiz;
	}

}
