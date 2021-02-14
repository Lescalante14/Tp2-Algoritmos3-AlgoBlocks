package edu.fiuba.algo3.modelo;

public class LapizActivado implements Lapiz {
	
	@Override	
    public int obtenerDibujo() {
		return 1;
    }

    @Override
    public boolean estado(){
        return true;
	}
}



