package edu.fiuba.algo3.modelo;

public class LapizDesactivado implements Lapiz {

	@Override 
	public int obtenerDibujo() {
		return 0;
    }
	@Override
    public boolean estado() {
        return false;
    }

}
