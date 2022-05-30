package application;

import java.util.Scanner;

public class Problema_Baskara {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double coeficiente[] = new double[3], x[] = new double[2], delta;
		
		System.out.println("Coeficiente a: ");
			coeficiente[0] = scan.nextDouble();
		System.out.println("Coeficiente b: ");
			coeficiente[1] = scan.nextDouble();
		System.out.println("Coeficiente c: ");
			coeficiente[2] = scan.nextDouble();
		 scan.close();

		delta = (Math.pow(coeficiente[1], 2)) - (4 * coeficiente[0] * coeficiente[2]);
		
		
		if (delta > 0) {
		x[0] = ((coeficiente[1] * -1) + Math.sqrt(delta)) / (2 * coeficiente[0]);
			x[1] = ((coeficiente[1] * -1) - Math.sqrt(delta)) / (2 * coeficiente[0]);
				System.out.printf("X1 = %.4f\nX2 = %.4f", x[0], x[1]);
		} else {
			System.out.println("Esta equação não possui raízes reais");
		}
		
	}

}