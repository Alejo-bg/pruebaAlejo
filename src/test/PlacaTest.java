package test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import good.be.alejo.pruebaAlejo.Placa;

class PlacaTest {

		
	@Test
	void comprobarPlaca() {
		Placa placa = new Placa("ABC");
		
		assertTrue(placa.asignarParqueadero()==true);
	}

	
	@Test
	void comprobarPlacaFalsa() {
		Placa placa = new Placa("CBA");
		
		assertTrue(placa.asignarParqueadero()==false);
	}
}
