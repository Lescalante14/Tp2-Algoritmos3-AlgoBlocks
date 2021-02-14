package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;

public class BloqueActivarLapiz implements Bloque {

    @Override
    public void ejecutar(Personaje unPersonaje){
        unPersonaje.activarLapiz();
    }

	@Override
	public void invertir(){
			;
	}
}
