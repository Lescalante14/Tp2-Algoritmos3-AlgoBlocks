package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.*;

public class BloqueActivarLapiz implements Bloque {
	
	private Lapiz lapiz;

	public BloqueActivarLapiz(){
			lapiz = new LapizActivado();
	}

    @Override
    public void ejecutar(Personaje unPersonaje){
        unPersonaje.cambiarLapiz(lapiz);
    }

	@Override
	public void invertir(){
		lapiz = new LapizDesactivado();
	}
}
