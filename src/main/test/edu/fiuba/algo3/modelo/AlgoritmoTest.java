package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.bloque.*;
import javafx.geometry.Pos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlgoritmoTest {
/*
    @Test
    public void seAgregaUnBloqueCorrectamente()
    {
        BloqueActivarLapiz bloqueActivaLapices = new BloqueActivarLapiz();
        Algoritmo algoritmo = new Algoritmo();

        algoritmo.agregarBloque(bloqueActivaLapices);

        assertEquals(1,algoritmo.cantidadBloques());
    }
*//*
    @Test
    public void seAgregan3BloquesCorrectamente()
    {
        Algoritmo algoritmo = new Algoritmo();

        algoritmo.agregarBloque(new BloqueActivarLapiz());
        algoritmo.agregarBloque(new BloqueDesactivarLapiz());
        algoritmo.agregarBloque(new BloqueMoverDerecha());

        assertEquals(3 , algoritmo.cantidadBloques());
    }
*/
    @Test
    public void seAgreganunBloqueYSeEjecutaCorrectamente()
    {
        Algoritmo algoritmo = new Algoritmo();
        Personaje personaje = new Personaje();
        algoritmo.agregarBloque(new BloqueActivarLapiz());

        algoritmo.ejecutar(personaje);

        assertEquals(1,personaje.obtenerLapiz().obtenerDibujo());
    }

    @Test
    public void seAgreganBloquesYSeEjecutanCorrectamente()
    {
        Algoritmo algoritmo = new Algoritmo();
        Personaje personaje = new Personaje();
        algoritmo.agregarBloque(new BloqueActivarLapiz());
        algoritmo.agregarBloque(new BloqueDesactivarLapiz());
        algoritmo.agregarBloque(new BloqueMoverDerecha());
        Posicion posicionInicial = personaje.getPosicion();

        algoritmo.ejecutar(personaje);
		posicionInicial.aDerecha();

        assertNotEquals(1,personaje.obtenerLapiz().obtenerDibujo());
        assertTrue(posicionInicial.compararPosicion(personaje.getPosicion()));
    }

    @Test
    public void seGuardaAlgoritmoPersonalizadoCorrectamente()
    {
        Algoritmo algoritmo = new Algoritmo();
        algoritmo.agregarBloque(new BloqueActivarLapiz());
        algoritmo.agregarBloque(new BloqueDesactivarLapiz());
        algoritmo.agregarBloque(new BloqueMoverDerecha());
        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();


        Bloque personalizado = algoritmo.guardaPersonalizado("nombre");
        algoritmo.vaciarBloques();
		algoritmo.agregarBloque(personalizado);
        algoritmo.ejecutar(personaje);

		posicionInicial.aDerecha();

        assertNotEquals(1,personaje.obtenerLapiz().obtenerDibujo());
        assertTrue(posicionInicial.compararPosicion(personaje.getPosicion()));
    }

    @Test
    public void algoritmoConBloqueDeRepeticion()
    {
        Algoritmo algoritmo = new Algoritmo();
        algoritmo.agregarBloque(new BloqueMoverDerecha());
        algoritmo.agregarBloque(new BloqueMoverAbajo());
        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();
        Posicion posicionFinal = new Posicion(2,-2);


        BloquePersonalizado personalizado = algoritmo.guardaPersonalizado("nombre");
		algoritmo.vaciarBloques();
        
		BloqueRepeticion bloqueRepeticion = new BloqueRepeticion(2);
		algoritmo.agregarBloque(bloqueRepeticion);
        
		bloqueRepeticion.agregarBloque(personalizado);
        
        algoritmo.ejecutar(personaje);

        assertEquals(1,personaje.obtenerLapiz().obtenerDibujo());
        assertTrue(posicionFinal.compararPosicion(personaje.getPosicion()));
    }

}


