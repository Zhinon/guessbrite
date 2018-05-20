package ar.com.ariel.aranda.guessbrite;

public class Machine implements Player {
	private int valor;
	private int min=0;
	private int max=100;
	
	public Machine(){
		this.valor= (int) (Math.random() * 101);
		//System.out.println(valor);
	}
	
	public int jugar() {
		valor=randomWithRange(this.min,this.max);
		System.out.println("It's your number " + valor + "?");
		return valor;
	}

	public int verificar(int numero) {
		if (numero < valor){
			System.out.println("My number is bigger");
		}else if(numero > valor){
			System.out.println("My number is smaller");
		}else{
			System.out.println("You win!");
			return 1;
		}
		return 0;
	}
	
	public void respuesta(String resp){
		if (resp.equals("+")){
			this.min=valor+1;
		}else if (resp.equals("-")){
			this.max=valor-1;
		}else {
			System.out.println("I win!");
		}
	}
	
	private int randomWithRange(int min, int max){
		int range = (max - min) + 1;     
		return (int)(Math.random() * range) + min;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}
	
}
