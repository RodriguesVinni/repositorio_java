package exerciciosJavaCondicional;

import java.util.Scanner;

//-	Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		int numA, numB, numC;
		
		System.out.print("Digite o primeiro valor: ");
		numA = tec.nextInt();
		System.out.print("Digite o segundo valor: ");
		numB = tec.nextInt();
		System.out.print("Digite o terceiro valor: ");
		numC = tec.nextInt();
		
		if (numA > numB && numA > numC){
			System.out.printf("O maior valor � %d ",numA);
		}
		else if (numB > numA && numB > numC){
			System.out.printf("O maior valor � %d",numB);
		}
		else {
			System.out.printf("O maior valor � %d",numC);
		}
		tec.close();
	}

}
