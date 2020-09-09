package exerciciosJavaCondicional;

import java.util.Scanner;

//-	Faça um programa que receba três inteiros e diga qual deles é o maior.

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
			System.out.printf("O maior valor é %d ",numA);
		}
		else if (numB > numA && numB > numC){
			System.out.printf("O maior valor é %d",numB);
		}
		else {
			System.out.printf("O maior valor é %d",numC);
		}
		tec.close();
	}

}
