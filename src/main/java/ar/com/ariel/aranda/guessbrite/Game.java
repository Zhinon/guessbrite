package ar.com.ariel.aranda.guessbrite;

import java.util.Scanner;

public class Game {
	private Player jugador1;
	private Player jugador2;
	
	public Game(){
		int valor=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Type 'me', if you want to guess a number. Otherwise, I will guess a number: ");
		String respuesta = sc.nextLine();
		if (respuesta.equals("me")){
			this.jugador2=new Machine();
			this.jugador1=new Human(jugador2);
			//System.out.println("puso me");
		}else{
			this.jugador1=new Machine();
			this.jugador2=new Human(jugador1);
			//System.out.println("puso cualquier otra cosa");
		}
		do{
			valor=jugador2.verificar(jugador1.jugar());
		}while(valor!=1);
	}
}
