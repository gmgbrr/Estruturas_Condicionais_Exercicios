package application;

import java.util.Scanner;

public class Problema_Operadora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int minutos;
		double valor;
		
		
		System.out.println("Digite a quantidade de minutos: ");
			minutos = scan.nextInt();
	 	 scan.close();
			 
	 	valor = 50; 
		 if (minutos > 100) {
			 minutos -= 100;
			 valor += minutos * 2;
		 } 
			
		 System.out.printf("Valor a pagar: R$%.2f", valor);

	}

}