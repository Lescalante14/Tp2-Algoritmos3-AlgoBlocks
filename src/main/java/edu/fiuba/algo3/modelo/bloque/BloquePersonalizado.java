package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Algoritmo;
import edu.fiuba.algo3.modelo.Personaje;

import java.util.ArrayList;
import java.util.List;

public class BloquePersonalizado implements Bloque {

    private String nombreBloque;
	private List<Bloque> secuenciaBloques;

    public BloquePersonalizado() {

        secuenciaBloques = new ArrayList<Bloque>();
        nombreBloque = "SinNombre";
    }

    @Override
    public void ejecutar(Personaje unPersonaje){
        for(Bloque unBloque : secuenciaBloques){
			unBloque.ejecutar(unPersonaje);
    	}
	}

	public void agregarBloque(Bloque unBloque){
		secuenciaBloques.add(unBloque);
	}

	public void cambiarNombre(String nombreNuevo){
			nombreBloque = nombreNuevo;
	}

	public void invertirPosicion(){
		for(Bloque unBloque : secuenciaBloques){
			unBloque.invertirPosicion();
		}
	}
}
