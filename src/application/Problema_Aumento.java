package application;

import java.util.Scanner;

public class Problema_Aumento {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double salario, aumento;
		int porcentagem;
		
		System.out.println("Salário da pessoa: ");
			salario = scan.nextDouble();
		 scan.close();
		
		if (salario <= 1000) { //20%
			porcentagem = 20;
			 aumento = salario * porcentagem/100;
			  System.out.printf("Novo salário = R$ %.2f", salario + aumento);
			   System.out.printf("\nAumento = R$ %.2f", aumento);
		  	    System.out.println("\nPorcentagem = " + porcentagem + "%");			
		} else if (salario > 1000 && salario <= 3000) { //15%
			porcentagem = 15;
			 aumento = salario * porcentagem/100;
			  System.out.printf("Novo salário = R$ %.2f", salario + aumento);
			   System.out.printf("\nAumento = R$ %.2f", aumento);
			    System.out.println("\nPorcentagem = " + porcentagem + "%");			    
		} else if (salario > 3000 && salario <= 8000) { //10%
			porcentagem = 10;
			 aumento = salario * porcentagem/100;
			  System.out.printf("Novo salário = R$ %.2f", salario + aumento);
			   System.out.printf("\nAumento = R$ %.2f", aumento);
			    System.out.println("\nPorcentagem = " + porcentagem + "%");
		} else { //5%
			porcentagem = 5;
			 aumento = salario * porcentagem/100;
			  System.out.printf("Novo salário = R$ %.2f", salario + aumento);
			   System.out.printf("\nAumento = R$ %.2f", aumento);
			    System.out.println("\nPorcentagem = " + porcentagem + "%");			    
		}
			
	}

}