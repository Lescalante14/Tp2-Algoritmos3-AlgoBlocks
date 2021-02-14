package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Algoritmo;
import edu.fiuba.algo3.modelo.Personaje;

import java.util.ArrayList;
import java.util.List;

public class BloqueRepeticion implements Bloque{

    private int iteraciones;
    private List<Bloque> listaBloques;

    public BloqueRepeticion(int iteraciones) {
        this.iteraciones = iteraciones;
        this.listaBloques = new ArrayList<Bloque>();
    }

    @Override
    public void ejecutar(Personaje unPersonaje) {
        for (Bloque unBloque : listaBloques ){
            unBloque.ejecutar(unPersonaje);
        }
    }

    public void agregarBloque(Bloque bloqueAgregar){	
        for (int i = 0; i<iteraciones; i++){
            this.listaBloques.add(bloqueAgregar);
    	}
    }

	@Override
	public void invertir(){

			;
	}
}
