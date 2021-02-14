package edu.fiuba.algo3.modelo;

import java.util.HashMap;


public class SectorDeDibujo {

	private HashMap<String,Integer> celdas;

    public SectorDeDibujo(){

		celdas = new HashMap<String,Integer>();
    }

	public void dibujarMovimiento(Personaje unPersonaje){
		if(celdas.containsKey(unPersonaje.getPosicion().toString() )){
			if( 0 == celdas.get(unPersonaje.getPosicion().toString())){
				celdas.put(unPersonaje.getPosicion().toString(), unPersonaje.obtenerLapiz().obtenerDibujo());
			}
		}
		celdas.put(unPersonaje.getPosicion().toString(), unPersonaje.obtenerLapiz().obtenerDibujo());		

	}

	public Integer estaDibujado(Posicion unaPosicion){
		if( celdas.containsKey(unaPosicion.toString()) ){
			return celdas.get(unaPosicion.toString());	
		}else{
			return 0;
		}
	}
}
