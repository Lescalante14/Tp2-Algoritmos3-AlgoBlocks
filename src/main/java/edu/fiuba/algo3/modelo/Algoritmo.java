package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.bloque.Bloque;
import edu.fiuba.algo3.modelo.bloque.BloquePersonalizado;
//
import edu.fiuba.algo3.modelo.*;

import java.util.ArrayList;
import java.util.List;

public class Algoritmo {

	private BloquePersonalizado bloquePersonalizado;

	public Algoritmo(){
        bloquePersonalizado = new BloquePersonalizado();	
    }

    public void agregarBloque(Bloque bloqueAgregar){

        bloquePersonalizado.agregarBloque(bloqueAgregar);
    }

    public void ejecutar(Personaje unPersonaje) {

        bloquePersonalizado.ejecutar(unPersonaje);
    }

    public BloquePersonalizado guardaPersonalizado(String nombre) {

        bloquePersonalizado.cambiarNombre(nombre);

        return bloquePersonalizado;
    }

	public void vaciarBloques(){
			bloquePersonalizado = new BloquePersonalizado();
	}
}
