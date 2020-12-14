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
    public void activarLápiz()
    {

        Personaje personaje = new Personaje();

        personaje.ejecutarBloque(new BloqueBajarLapiz());

        assertEquals(personaje.estadoLapiz(), "ESTADO ACTIVADO");

    }


}
