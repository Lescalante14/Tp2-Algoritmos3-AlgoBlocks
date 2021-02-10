package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LapizTest {

    @Test
    public void LapizRecienCreadoNoEstaActivado(){

        Lapiz lapiz = new Lapiz();

        assertFalse(lapiz.estaActivado());
    }

    @Test
    public void AlActivarLapizRecienCreadoEfectivamenteEstaActivado(){

        Lapiz lapiz = new Lapiz();
        lapiz.activar();
        assertTrue(lapiz.estaActivado());
    }

    @Test
    public void LapizRecienCreadoNoHaPintadoSobreElSector(){

        Lapiz lapiz = new Lapiz();

        assertEquals(0,lapiz.totalDeCasillasPintadas());

    }

    @Test
    public void LapizRecienCreadoDibujaSobreElSectorUnaVezYLasCasillasPintadasSonLasCorrespondientes(){

        Lapiz lapiz = new Lapiz();
        lapiz.activar();
        Posicion posicionInicial = new Posicion(0,0);
        Posicion posicionFinal = new Posicion(1,0);
        lapiz.dibujarDesdeHasta(posicionInicial, posicionFinal);

        assertEquals(1,lapiz.totalDeCasillasPintadas());

    }

    @Test
    public void LapizDesactivadoNoDibujaSobreElSectorYLasCasillasPintadasSonLasCorrespondientes(){

        Lapiz lapiz = new Lapiz();

        Posicion posicionInicial = new Posicion(0,0);
        Posicion posicionFinal = new Posicion(1,0);
        lapiz.dibujarDesdeHasta(posicionInicial, posicionFinal);

        assertEquals(0,lapiz.totalDeCasillasPintadas());

    }

    @Test
    public void LapizRecienCreadoDibujaSobreElSectorTresVecesYLasCasillasPintadasSonLasCorrespondientes(){

        Lapiz lapiz = new Lapiz();
        lapiz.activar();
        Posicion posicionPrimera = new Posicion(0,0);
        Posicion posicionSegunda = new Posicion(1,0);
        Posicion posicionTercera = new Posicion(2,0);
        Posicion posicionCuarta = new Posicion(3,0);

        lapiz.dibujarDesdeHasta(posicionPrimera,posicionSegunda);
        lapiz.dibujarDesdeHasta(posicionSegunda,posicionTercera);
        lapiz.dibujarDesdeHasta(posicionTercera,posicionCuarta);

        assertEquals(3,lapiz.totalDeCasillasPintadas());

    }

}
