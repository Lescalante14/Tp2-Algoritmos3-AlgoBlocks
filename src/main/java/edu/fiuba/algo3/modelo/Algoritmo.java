package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.bloque.Bloque;
import edu.fiuba.algo3.modelo.bloque.BloquePersonalizado;

import java.util.ArrayList;
import java.util.List;

public class Algoritmo {

    private List <Bloque> secuenciaBloques;

    public Algoritmo(){
        secuenciaBloques = new ArrayList<Bloque>();
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
		//try{}catch{}
		try{
        	ValidaAlgoritmo.algoritmoValido(this.cantidadBloques());
    		}
		}catch(AlgoritmoVacioError){
			//System.out.println("ErrorDeTry");
		}finally{
			for (Bloque unBLoque : secuenciaBloques) {
            	unBLoque.ejecutar(unPersonaje);	
		}
	}

    public BloquePersonalizado guardaAlgoritmoPersonalizado(String nombre) {

        try{
			ValidaAlgoritmo.algoritmoValido(this.cantidadBloques());
			ValidaNombre.nombreValido(nombre);
		}catch(AlgoritmoVacioError){
			
		}catch(NombreVacioError){
			
		}finally{	
			BloquePersonalizado personalizado = new BloquePersonalizado(nombre, secuenciaBloques);
        	secuenciaBloques = new ArrayList<Bloque>();
        	return personalizado;
		}	
    }

    public ArrayList<Bloque> invertirSecuenciaDeBloques() {

        ArrayList<Bloque> bloquesInvertidos = new ArrayList<Bloque>();

        for (Bloque unBLoque : secuenciaBloques) {
            bloquesInvertidos.add(unBLoque.inverso());
        }

        return bloquesInvertidos;
    }

}
