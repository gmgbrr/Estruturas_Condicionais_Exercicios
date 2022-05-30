package application;

import java.util.Scanner;

public class Problema_Troco_verificado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double precoUnidade, pagamento, troco;
		int quantidade;
		
		
		System.out.println("Preço unitário do produto: ");
			precoUnidade = scan.nextDouble();
		System.out.println("Quantidade comprada: ");
			quantidade = scan.nextInt();
		System.out.println("Dinheiro recebido: ");
			pagamento = scan.nextDouble();
		 scan.close();
		
		troco = pagamento - quantidade * precoUnidade;	
				
		if (pagamento >= (quantidade * precoUnidade)) {			
		 System.out.printf("TROCO = R$%.2f", troco);
		} else {
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS", troco * -1);
		}
		
	}

}