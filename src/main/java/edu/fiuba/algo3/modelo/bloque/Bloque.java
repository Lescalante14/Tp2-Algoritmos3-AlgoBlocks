package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.personaje.Personaje;

public interface Bloque  {

    void ejecutar(Personaje unPersonaje);

    Bloque inverso();
}
