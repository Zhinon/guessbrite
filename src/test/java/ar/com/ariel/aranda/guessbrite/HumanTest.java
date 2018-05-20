package ar.com.ariel.aranda.guessbrite;

import ar.com.ariel.aranda.guessbrite.Human;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class HumanTest extends TestCase {
	@Before
	public void setup(){
		Scanner sc = new Scanner(System.in);
		
	}
	
	@Test
	public void testJugar() {
		Human prueba = new Human(new Machine());
		int respuesta = prueba.jugar();
		Assert.assertTrue(respuesta < 101 && respuesta > 0);
	}
	@Test
	public void testVerificar() {
		Human prueba = new Human(new Machine());
		System.out.println("Verificar si el valor pensado es 50 devuelve 1 si es + o - devuelve 0");
		int respuesta = prueba.verificar(50);
		Assert.assertEquals(respuesta, 1);
		Assert.assertEquals(respuesta, 0);
	}

}
