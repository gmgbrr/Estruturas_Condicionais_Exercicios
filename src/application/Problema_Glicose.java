package application;

import java.util.Scanner;

public class Problema_Glicose {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double glicose;
		
		
		System.out.println("Digite a taxa de glicose");
			glicose = scan.nextDouble();
		scan.close();
			
			
		if (glicose <= 100) {
			System.out.println("Classifica��o: normal");
		} else if (glicose >= 140) {
			System.out.println("Classifica��o: elevado");
		} else {
			System.out.println("Classifica��o: diabetes");
		}
	
	}

}