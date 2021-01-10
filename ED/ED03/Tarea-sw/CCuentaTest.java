import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CCuentaTest {

	CCuenta miCuenta = new CCuenta();
	
	/*
	 * Primera prueba de test para el caso 1. Ingreso por un valor de -3
	 */
	
	
	@Test
	public void testIngresarEspecial() {
		
			int esperado = 2;	//Resultado esperado para la primera prueba con un ingreso de -3
			assertEquals(esperado,miCuenta.ingresar(-3));
		
	}
	
	/*
	 * Segunda prueba de test para el caso 2. Ingreso por un valor mayor que 0
	 */
	
	
	@Test
	public void testIngresarPositivo() {
		
			int esperado = 0;	//Resultado esperado para la segunda prueba con un ingreso mayor que 0
			assertEquals(esperado,miCuenta.ingresar(1));
		
	}
	
	/*
	 * Tercera prueba de test para el caso 3. Ingreso por un valor negativo
	 */
	
	
	@Test
	public void testIngresarNegativo() {
		
			int esperado = 1;	//Resultado esperado para la primera prueba con un ingreso de -3
			assertEquals(esperado,miCuenta.ingresar(-1));
		
	}

}
