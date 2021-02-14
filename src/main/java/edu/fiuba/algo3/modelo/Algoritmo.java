package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.bloque.Bloque;
import edu.fiuba.algo3.modelo.bloque.BloquePersonalizado;
//
import edu.fiuba.algo3.modelo.*;

import java.util.ArrayList;
import java.util.List;

public class Algoritmo {

	private BloquePersonalizado bloquePersonalizado;
	private int cantidadBloques;

    public Algoritmo(){
        bloquePersonalizado = new BloquePersonalizado();
		cantidadBloques = 0;
    }

/*    public Algoritmo(List <Bloque> secuencia){
            secuenciaBloques = secuencia;
    }
*/
    public void agregarBloque(Bloque bloqueAgregar){

        bloquePersonalizado.agregarBloque(bloqueAgregar);
		cantidadBloques++;

    }

    public int cantidadBloques(){
        return this.cantidadBloques;
    }

    public void ejecutarAlgoritmo(Personaje unPersonaje) {

        bloquePersonalizado.ejecutar(unPersonaje);
    }

    public BloquePersonalizado guardaAlgoritmoPersonalizado(String nombre) {

        bloquePersonalizado.cambiarNombre(nombre);

        return bloquePersonalizado;
    }

	public void vaciarBloques(){
			bloquePersonalizado = new BloquePersonalizado();
			cantidadBloques = 0;
	}
}
