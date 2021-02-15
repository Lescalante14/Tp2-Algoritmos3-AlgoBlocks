package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.*;

public class BloqueDesactivarLapiz implements Bloque {
	
	private Lapiz lapiz;

	public BloqueDesactivarLapiz(){
		lapiz = new LapizDesactivado();
	}

    @Override
    public void ejecutar(Personaje unPersonaje) {
        unPersonaje.cambiarLapiz(lapiz);
    }

	@Override
	public void invertir(){
			lapiz = new LapizActivado();
	}
}
