package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SectorDeDibujoTest {

    @Test
    public void creacionDelSectorConTamanioEsperado(){

        SectorDeDibujo sector = new SectorDeDibujo();
		Posicion unaPosicion = new Posicion();

        assertEquals(0, sector.estaDibujado(unaPosicion));

    }

    @Test
    public void sectorComienzaEnBlanco(){

        SectorDeDibujo sector = new SectorDeDibujo();
		Posicion unaPosicion = new Posicion();

        assertEquals(0,sector.estaDibujado(unaPosicion));
    }
/*
    @Test
    public void totalDeCasillasPintadasCoincideConDespuesDeHaberDibujadoUnaVez(){

        SectorDeDibujo sector = new SectorDeDibujo();
        Posicion posicionVieja = new Posicion(0,0);
        Posicion posicionNueva = new Posicion(1,0);

        sector.dibujarDesdeHasta(posicionVieja, posicionNueva);

        assertEquals(1, sector.totalDeCasillasDibujadas());

    }
/*
    @Test
    public void totalDeCasillasPintadasCoincideConDespuesDeHaberDibujadoTresVeces(){

        SectorDeDibujo sector = new SectorDeDibujo();
        Posicion posicionPrimera = new Posicion(0,0);
        Posicion posicionSegunda = new Posicion(1,0);
        Posicion posicionTercera = new Posicion(2,0);
        Posicion posicionCuarta = new Posicion(3,0);

        sector.dibujarDesdeHasta(posicionPrimera,posicionSegunda);
        sector.dibujarDesdeHasta(posicionSegunda,posicionTercera);
        sector.dibujarDesdeHasta(posicionTercera,posicionCuarta);

        assertEquals(3, sector.totalDeCasillasDibujadas());

    }
*/

}
