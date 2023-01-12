package utils;

import java.util.Random;

public class NumeroRandom {

	public static void main(String[] args) {
		int aleatorio = 0;
		
//		aleatorio = (int) (Math.random() * 1000);
//		System.out.print(aleatorio);
		
		Random r = new Random();
		aleatorio = (int) (r.nextDouble() * 1000);
		System.out.print(aleatorio);
	}

}
