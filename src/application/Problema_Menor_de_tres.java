package application;

import java.util.Scanner;

public class Problema_Menor_de_tres {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int valor[] = new int[3], menorValor;
		
		
		System.out.println("Primeiro valor: ");
			valor[0] = scan.nextInt();
		System.out.println("Segundo valor: ");
			valor[1] = scan.nextInt();
		System.out.println("Terceiro valor: ");
			valor[2] = scan.nextInt();
		scan.close();
		
		
		menorValor = valor[0];
			if (valor[1] < menorValor) {
				menorValor = valor[1];
			} 
				if (valor[2] < menorValor) {
					menorValor = valor[2];
				}
		
		System.out.printf("MENOR = %d", menorValor);
	
	}

}