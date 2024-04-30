package de.demmer.dennis.aufgaben;

public class Aufgabe2 {
	
	
	static void reverse(String toReverse) {

		//[ 0, 1 ,2 ]  3
		//[ A, B, C ]
		char[] charArr = toReverse.toCharArray();

		for(int i = charArr.length - 1 ;  i >= 0 ; i--) {
			
			System.out.print(charArr[i]);
			
		}
		
		

	}
	
	
	public static void main(String[] args) {
		
		reverse("Java");
		//nehcuklefpA
		
	}
	
	

}
