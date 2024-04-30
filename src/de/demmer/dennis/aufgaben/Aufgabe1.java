package de.demmer.dennis.aufgaben;

import java.util.Arrays;

public class Aufgabe1 {
	
	public static void main(String[] args) {
		
		//   0  |    0  |   0  |   0  |   0  |   0  |   0  |   0  | ...
		int[] intArr = new int[150];
	
		for(int i = 0 ; i < intArr.length  ; i++) {
			intArr[i] = 42;
		}
		
		
		
		for (int current : intArr) {
			System.out.print(current + " ,");
		}
		
		
		
//		String arrayString = Arrays.toString(intArr);
//		
//		System.out.println(arrayString);
		
		
		
	}
	

}
