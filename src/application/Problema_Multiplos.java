package application;

import java.util.Scanner;

public class Problema_Multiplos {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num[] = new int[2];
		
		
		System.out.println("Digite dois números inteiros: ");
			num[0] = scan.nextInt();
			 num[1] = scan.nextInt();
		scan.close();
		
			 if (num[0] % num[1] == 0 || num[1] % num[0] == 0) {
				 System.out.println("São multiplos");				 
			 } else {
				 System.out.println("Não são multiplos");
			 }

	}

}