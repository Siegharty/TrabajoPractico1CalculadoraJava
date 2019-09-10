package Controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {
	

	@Test
	public void testSuma() {
		Calculadora calc = new Calculadora(2,2,"+");
		assertTrue(calc.DevolverOperacion().equals("4.0"));
	}
	
	@Test
	public void testSumaConDecimales() {
		Calculadora calc = new Calculadora(2.5,2.5,"+");
		assertTrue(calc.DevolverOperacion().equals("5.0"));
	}
	
	@Test
	public void TestSumaConNegativos() {
		Calculadora calc = new Calculadora(-2,2,"+");
		assertTrue(calc.DevolverOperacion().equals("0.0"));
	}

	@Test
	public void testResta() {
		Calculadora calc = new Calculadora(3,2,"-");
		assertTrue(calc.DevolverOperacion().equals("1.0"));
	}
	
	@Test
	public void testRestaConDecimales() {
		Calculadora calc = new Calculadora(3.5,2.5,"-");
		assertTrue(calc.DevolverOperacion().equals("1.0"));
	}

	@Test
	public void testDivision() {
		Calculadora calc = new Calculadora(6,3,"/");
		assertTrue(calc.DevolverOperacion().equals("2.0"));
	}
	
	/*@Test
	public void testDivisionConDecimales() {
		Calculadora calc = new Calculadora(6.3,2.3,"/");
		assertTrue(calc.DevolverOperacion().equals("2,739130434782609"));
	}*/
	
	/*@Test
	public void TestDivisionConNegativos() {
		Calculadora calc = new Calculadora(-3.3,2.5,"*");
		assertTrue(calc.DevolverOperacion().equals("-8.25"));
	}*/

	@Test
	public void testMultiplicacion() {
		Calculadora calc = new Calculadora(5,5,"*");
		assertTrue(calc.DevolverOperacion().equals("25.0"));
	}
	
	@Test
	public void testMultiplicacionConDecimales() {
		Calculadora calc = new Calculadora(3.3,2.5,"*");
		assertTrue(calc.DevolverOperacion().equals("8.25"));
	}
	
	@Test
	public void TestMultiplicacionConNegativos() {
		Calculadora calc = new Calculadora(-3.3,2.5,"*");
		assertTrue(calc.DevolverOperacion().equals("-8.25"));
	}

}
