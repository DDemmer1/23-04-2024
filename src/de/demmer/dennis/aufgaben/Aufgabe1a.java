package de.demmer.dennis.aufgaben;

import java.util.Arrays;

public class Aufgabe1a {
	
	
	public static void main(String[] args) {
		
		int[] randomArray = new int[150];
		
		for (int i = 0; i < randomArray.length; i++) {
			
			// 0.457
			double random = Math.random();
			
			//0
			long roundedRandom = Math.round(random);
			
			//0 aber vom typ int
			int castedRandom = (int) roundedRandom;
			
		
			randomArray[i] = castedRandom;
			
			
			// -------alternativ in einer Zeile-----
			
//			randomArray[i] = (int) Math.round(Math.random());

		}
		
		
		
		System.out.println(Arrays.toString(randomArray));
		
		
	}

}
