package edu.fiuba.algo3.modelo.algortimo;

import edu.fiuba.algo3.excepciones.AlgoritmoVacioError;
import edu.fiuba.algo3.excepciones.NombreVacioError;
import edu.fiuba.algo3.modelo.ValidaAlgoritmo;
import edu.fiuba.algo3.modelo.ValidaNombre;
import edu.fiuba.algo3.modelo.bloque.Bloque;
import edu.fiuba.algo3.modelo.bloque.BloquePersonalizado;
import edu.fiuba.algo3.modelo.Personaje;

import java.util.ArrayList;
import java.util.List;

public class Algoritmo {

    private List <Bloque> secuenciaBloques;

    public Algoritmo(){
        secuenciaBloques = new ArrayList<>();
    }

    public Algoritmo(List <Bloque> secuencia){
            secuenciaBloques = secuencia;
    }

    public void agregarBloque(Bloque bloqueAgregar){

        this.secuenciaBloques.add(bloqueAgregar);

    }

    public int cantidadBloques(){
        return this.secuenciaBloques.size();
    }

    public void ejecutarAlgoritmo(Personaje unPersonaje) {
		try{
        	ValidaAlgoritmo.algoritmoValido(this.cantidadBloques());
    		}
		catch(AlgoritmoVacioError algoritmoVacioError) {
            throw algoritmoVacioError;
        }
		for (Bloque unBLoque : secuenciaBloques) {
            	unBLoque.ejecutar(unPersonaje);	
		}
	}

    public BloquePersonalizado guardaAlgoritmoPersonalizado(String nombre) {

        try{
			ValidaAlgoritmo.algoritmoValido(this.cantidadBloques());
			ValidaNombre.nombreValido(nombre);
		}catch(AlgoritmoVacioError algoritmoVacioError){
            throw algoritmoVacioError;
		}catch(NombreVacioError nombreVacioError){
            throw nombreVacioError;
		}
        BloquePersonalizado personalizado = new BloquePersonalizado(nombre, secuenciaBloques);
        vaciarAlgoritmo();
        return personalizado;
    }

    public ArrayList<Bloque> invertirSecuenciaDeBloques() {

        ArrayList<Bloque> bloquesInvertidos = new ArrayList<Bloque>();

        for (Bloque unBLoque : secuenciaBloques) {
            bloquesInvertidos.add(unBLoque.inverso());
        }

        return bloquesInvertidos;
    }

    public void vaciarAlgoritmo() {
        secuenciaBloques = new ArrayList<>();
    }
}
