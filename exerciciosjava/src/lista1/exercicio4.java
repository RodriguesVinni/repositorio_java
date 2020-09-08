package lista1;

import java.util.Scanner;

/*4. Escreva  um sistema que leia três números inteiros
 *e positivos (A, B, C) e calcule a seguinte expressão: */

public class exercicio4 {

	public static void main(String[] args) {
		
		double numA, numB, numC, numR, numS, totalD;
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Digite valor para A: ");
		numA = tec.nextInt();
		System.out.println("Digite valor para B: ");
		numB = tec.nextInt();
		System.out.println("Digite valor para c: ");
		numC = tec.nextInt();
		
		System.out.println("D = R + S / 2 ");
		
		numR = Math.pow((numA + numB), 2);
		numS = Math.pow((numB + numC), 2);
		totalD = (numR + numS) / 2;
		
		System.out.printf("O resultado da é: %.2f",totalD);
	}

}
