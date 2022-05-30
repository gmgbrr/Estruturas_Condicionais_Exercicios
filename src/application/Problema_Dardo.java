package application;

import java.util.Scanner;

public class Problema_Dardo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double distancia[] = new double[3], maior;
		
		
		System.out.println("Digite as tres distâncias: ");
			distancia[0] = scan.nextDouble();
			 distancia[1] = scan.nextDouble();
			  distancia[2] = scan.nextDouble();
		 scan.close();
		
		maior = distancia[0];
		 if (distancia[1] > maior) {
			 maior = distancia[1];
		 } if (distancia[2] > maior) {
			 maior = distancia[2];
		   }
		 
		System.out.printf("MAIOR DISTANCIA = %.2f", maior);
		
	}

}