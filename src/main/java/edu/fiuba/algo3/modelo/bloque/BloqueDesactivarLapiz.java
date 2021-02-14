package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.*;

public class BloqueDesactivarLapiz implements Bloque {
	
	private Lapiz unLapiz;

	public BloqueDesactivarLapiz(){
		unLapiz = new LapizDesactivado();
	}

    @Override
    public void ejecutar(Personaje unPersonaje) {
        unPersonaje.cambiarLapiz(unLapiz);
    }

	@Override
	public void invertir(){
			unLapiz = new LapizActivado();
	}
}
