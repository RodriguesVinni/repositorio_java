package lista1;

import java.util.Scanner;

/* * 8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a 
 * percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
 * escrever um sistema que leia o custo de f�brica de um carro e escreva o 
 * custo ao consumidor. */

public class exercicio8 {

	public static void main(String[] args) {
		
		final double DISTRIBUIDOR = 0.28;
		final double IMPOSTO= 0.45; 
		double custoFrabrica, custoConsumidor;
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Entre com o custo de f�brica do carro: ");
		custoFrabrica = tec.nextDouble();
		
		custoConsumidor = (custoFrabrica + (custoFrabrica * DISTRIBUIDOR) + (custoFrabrica * IMPOSTO));
		
		System.out.printf("\nO custo do carro para o consumidor �: R$ %.2f", custoConsumidor);
		
		tec.close();
	}
}

