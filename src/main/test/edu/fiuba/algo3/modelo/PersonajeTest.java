package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonajeTest {

    @Test
    public void creacióndelPersonajeConElLápizArriba()
    {

        Personaje personaje = new Personaje();

        assertFalse(personaje.lapiz());

    }

    @Test
    public void activarLápiz()
    {

        Personaje personaje = new Personaje();

        personaje.activarLapiz();

        assertTrue(personaje.lapiz());

    }

}
