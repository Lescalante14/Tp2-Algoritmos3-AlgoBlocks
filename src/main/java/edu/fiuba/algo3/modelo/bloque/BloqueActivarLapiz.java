package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.*;

public class BloqueActivarLapiz implements Bloque {
	
	private Lapiz unLapiz;

	public BloqueActivarLapiz(){
			unLapiz = new LapizActivado();
	}

    @Override
    public void ejecutar(Personaje unPersonaje){
        unPersonaje.cambiarLapiz(unLapiz);
    }

	@Override
	public void invertir(){
		unLapiz = new LapizDesactivado();
	}
}
