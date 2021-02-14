package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;

import java.util.ArrayList;
import java.util.List;

public class BloqueInvertir implements Bloque {
    
	private List<Bloque> listaAInvertirBloques;

	public BloqueInvertir(){
		listaAInvertirBloques = new ArrayList<Bloque>();
	}

	public void agregarBloque(Bloque unBloque){
		listaAInvertirBloques.add(unBloque);	
	}

	@Override
    public void ejecutar(Personaje unPersonaje) { 	

		for(Bloque unBloque : listaAInvertirBloques){
			unBloque.ejecutar(unPersonaje);
		}	
    }
	
	@Override
	public void invertir(){
	
		for(Bloque unBloque : listaAInvertirBloques){
			unBloque.invertir();
		}

	}
}
