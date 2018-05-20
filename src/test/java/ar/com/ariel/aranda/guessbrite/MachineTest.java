package ar.com.ariel.aranda.guessbrite;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MachineTest {

	@Test
	public void testJugar() {
		Machine prueba = new Machine();
		int resultado = prueba.jugar();
		Assert.assertTrue(resultado < 101 && resultado > 0);
		prueba.setMin(20);
		resultado = prueba.jugar();
		Assert.assertTrue(resultado < 101 && resultado > 19);
		prueba.setMax(80);
		resultado = prueba.jugar();
		Assert.assertTrue(resultado < 81 && resultado > 19);
		prueba.setMin(40);
		resultado = prueba.jugar();
		Assert.assertTrue(resultado < 81 && resultado > 39);
		prueba.setMax(60);
		resultado = prueba.jugar();
		Assert.assertTrue(resultado < 61 && resultado > 39);
		prueba.setMax(50);
		resultado = prueba.jugar();
		Assert.assertTrue(resultado < 51 && resultado > 39);
		prueba.setMin(50);
		resultado = prueba.jugar();
		Assert.assertTrue(resultado < 51 && resultado > 49);
		resultado = prueba.jugar();
		Assert.assertTrue(resultado < 51 && resultado > 49);
		resultado = prueba.jugar();
		Assert.assertTrue(resultado < 51 && resultado > 49);
		resultado = prueba.jugar();
		Assert.assertTrue(resultado < 51 && resultado > 49);
		resultado = prueba.jugar();
		Assert.assertEquals(50, resultado);
	}

	@Test
	public void testVerificar() {
		Machine prueba = new Machine();
		prueba.setValor(50);
		Assert.assertEquals(0, prueba.verificar(30));
		Assert.assertEquals(0, prueba.verificar(60));
		Assert.assertEquals(0, prueba.verificar(49));
		Assert.assertEquals(0, prueba.verificar(51));
		Assert.assertEquals(0, prueba.verificar(100));
		Assert.assertEquals(0, prueba.verificar(0));
		Assert.assertEquals(1, prueba.verificar(50));
	}

	@Test
	public void testRespuesta() {
		Machine prueba = new Machine();
		prueba.setValor(50);
		prueba.respuesta("+");
		Assert.assertEquals(51, prueba.getMin());
		prueba.setValor(50);
		prueba.respuesta("-");
		Assert.assertEquals(49, prueba.getMax());
		
	}

}
