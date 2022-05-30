package application;

import java.util.Scanner;

public class Problema_Lanchonete {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double preco[] = {5, 3.5, 4.8, 8.9, 7.32}, valor = 0;
		byte produto;
		int quantidade;

		
		System.out.println("Código do produto comprado: ");
			produto = scan.nextByte();
		System.out.println("Quantidade comprada: ");
			quantidade = scan.nextInt();
		scan.close();
			
		switch (produto) {
		 case 1:
			 valor = preco[0] * quantidade;
			 break;
		 case 2:
			 valor = preco[1] * quantidade;	 
			 break;
		 case 3:
			 valor = preco[2] * quantidade;	 
			 break;
		 case 4:
			 valor = preco[3] * quantidade;	 
			 break;
		 case 5:
			 valor = preco[4] * quantidade;	 
			 break;
		}
		
		System.out.printf("Valor a pagar: R$%.2f", valor);
 
		}
	}