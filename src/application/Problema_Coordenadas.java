package application;

import java.util.Scanner;

public class Problema_Coordenadas {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double coord[] = new double[2];
		String pos;
		
		System.out.println("Valor de X: ");
			coord[0] = scan.nextDouble();
		 System.out.println("Valor de Y: ");
			 coord[1] = scan.nextDouble();
		scan.close();
		
		if (coord[0] > 0 && coord[1] > 0) {
			pos = "Q1";
		} else if (coord[0] < 0 && coord[1] > 0) {
			pos = "Q2";
		} else if (coord[0] < 0 && coord[1] < 0) {
			pos = "Q3";
		} else if (coord[0] > 0 && coord[1] < 0) {
			pos = "Q4";
		} else if (coord[0] != 0 && coord[1] == 0) {
			pos = "Eixo X";
		} else if (coord[0] == 0 && coord[1] != 0) {
			pos = "Eixo Y";
		} else {
			pos = "Origem";
		}
		
			System.out.println(pos);
			
	}

}