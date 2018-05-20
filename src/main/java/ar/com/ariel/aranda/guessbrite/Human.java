package ar.com.ariel.aranda.guessbrite;

import java.util.Scanner;

public class Human implements Player {

	private Scanner sc;
	private Machine contrincante;

	public Human(Player contrincante){
		this.sc = new Scanner(System.in);
		this.contrincante = (Machine) contrincante;
	}
	public int jugar() {
		System.out.println("Choose a number from 1 to 100: ");
		int respuesta = sc.nextInt();
		//sc.close();
		return respuesta;
	}

	public int verificar(int numero) {
		//System.out.println("Choose a number from 1 to 100: ");
		String respuesta = sc.nextLine();
		contrincante.respuesta(respuesta);
		if (!respuesta.equals("+") && !respuesta.equals("-")){
			return 1;
		}
		return 0;
	}
}
