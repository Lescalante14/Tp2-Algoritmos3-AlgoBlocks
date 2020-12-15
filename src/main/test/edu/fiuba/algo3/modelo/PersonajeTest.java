package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonajeTest {

    @Test
    public void creacióndelPersonajeConElLápizArriba()
    {

        Personaje personaje = new Personaje();

        assertEquals(personaje.estadoLapiz(), "ESTADO DESACTIVADO");

    }

    @Test
    public void posicionDeUnPersonajeRecienCreadoEsLaCorrespondiente(){

        Personaje personaje = new Personaje();

        Posicion posicionCero = new Posicion(0,0);

        assertEquals(personaje.getPosicion().esIgualA(posicionCero), true);


    }

    @Test
    public void activarLápiz()
    {

        Personaje personaje = new Personaje();

        personaje.ejecutarBloque(new BloqueBajarLapiz());

        assertEquals(personaje.estadoLapiz(), "ESTADO ACTIVADO");

    }

    @Test
    public void desactivarLápiz()
    {

        Personaje personaje = new Personaje();

        personaje.ejecutarBloque(new BloqueBajarLapiz());

        assertEquals(personaje.estadoLapiz(), "ESTADO ACTIVADO");

        personaje.ejecutarBloque(new BloqueSubirLapiz());

        assertEquals(personaje.estadoLapiz(), "ESTADO DESACTIVADO");

    }

    @Test
    public void desactivarLápiz()
    {

        Personaje personaje = new Personaje();

        personaje.ejecutarBloque(new BloqueMoverDerecha());

        assertEquals(//Se compara la posición actual con dónde debería estar el personaje después de moverse a derecha);


    }

}
