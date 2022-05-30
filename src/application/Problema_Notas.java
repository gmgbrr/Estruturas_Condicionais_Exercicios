package application;

import java.util.Scanner;

public class Problema_Notas {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double nota[] = new double[2], notaFinal;
		
		System.out.println("Digite a primeira nota: ");
			nota[0] = scan.nextDouble();
		System.out.println("Digite a segunda nota: ");
			nota[1] = scan.nextDouble();
		 scan.close();
		
		notaFinal = nota[0] + nota[1];
		
		System.out.printf("NOTA FINAL = %.1f", notaFinal);
			if (notaFinal < 60) {
				System.out.println("\nREPROVADO");
			}
	
	}

}