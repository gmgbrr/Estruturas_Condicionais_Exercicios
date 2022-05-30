package application;

import java.util.Scanner;

public class Problema_Temperatura {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		char charTemp;
		double temp, celsius, fahrenheit;
		
		System.out.println("Voce vai digitar a temperatura em qual escala (C/F)?");
			charTemp = scan.next().charAt(0);
			
		switch (charTemp) {		
			case 'F':
				System.out.println("Digite a temperatura em Fahrenheit: ");
				 fahrenheit = scan.nextDouble();
				  temp = (fahrenheit - 32) / 1.8;
				System.out.printf("Temperatura equivalente em Celsius: %.2f", temp);
				break;
			case 'C':	
				System.out.println("Digite a temperatura em Celsius: ");
				 celsius = scan.nextDouble();
				  temp = celsius * 1.8 + 32;
				System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", temp);		
				break;
			default:
				System.out.print("Valor inválido");
				break;
			
		}	
		scan.close();
	}

}