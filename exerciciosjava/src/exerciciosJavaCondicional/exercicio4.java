package exerciciosJavaCondicional;
/*4-Faça um programa em que permita a entrada de um número
 * qualquer e exiba se este número é par ou ímpar. Se for par 
 * exiba também a raiz quadrada do mesmo; se for ímpar exiba o número 
 * elevado ao quadrado.*/

import java.util.*;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		double numero, raiz=0, pow;
		
		System.out.print("Digite um número: ");
		numero = tec.nextInt();
		
		if (numero % 2 == 0) {
			
			raiz = (Math.sqrt(numero));
			System.out.printf("O número %.0f é PAR e sua raiz quadrade é igual a: %.2f", numero, raiz);
		}
		else {
			
			pow = Math.pow(numero, 2);
			System.out.printf("O número %.0f é IMPAR e elevado ao quadrado totaliza: %.2f", numero, pow);
		}
		tec.close();
	}

}
