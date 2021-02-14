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

/*    public Algoritmo(List <Bloque> secuencia){
            secuenciaBloques = secuencia;
    }
*/
    public void agregarBloque(Bloque bloqueAgregar){

        bloquePersonalizado.agregarBloque(bloqueAgregar);

    }
/*
    public int cantidadBloques(){
        return this.secuenciaBloques.size();
    }
*/
    public void ejecutarAlgoritmo(Personaje unPersonaje) {

        bloquePersonalizado.ejecutar(unPersonaje);
    }

    public BloquePersonalizado guardaAlgoritmoPersonalizado(String nombre) {

        bloquePersonalizado.cambiarNombre(nombre);

        return bloquePersonalizado;
    }
}
