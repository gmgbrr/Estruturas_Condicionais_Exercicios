package application;

import java.util.Scanner;

public class Problema_Tempo_de_jogo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int hora[] = new int[2], tempo;
		
		System.out.println("Hora inicial: ");
			hora[0] = scan.nextInt();
		 System.out.println("Hora final: ");
			 hora[1] = scan.nextInt();
		scan.close();
		
		
		if (hora[0] > hora[1]) {
			tempo = 24 - hora[0] + hora[1];
		} else if (hora[1] > hora[0])  {
			 tempo = hora[1] - hora [0];
		  } else {
			  tempo = 24;
		    }
		  
			System.out.println(tempo);

	}

}