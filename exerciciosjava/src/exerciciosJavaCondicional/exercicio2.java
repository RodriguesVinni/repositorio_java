package exerciciosJavaCondicional;

// 2-Faça um programa que entre com três números e coloque em ordem crescente.

import java.util.*;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		int varA, varB, varC;
		
		System.out.print("Digite o primeiro valor: ");
		varA = tec.nextInt();
		System.out.print("Digite o primeiro valor: ");
		varB = tec.nextInt();
		System.out.print("Digite o primeiro valor: ");
		varC = tec.nextInt();
		
		if (varA < varB && varB < varC) {
			System.out.println(varA+"\n"+varB+"\n"+varC);
		}
		if (varB < varA && varA < varC) {
			System.out.println(varB+"\n"+varA+"\n"+varC);
		}
		if (varC < varB && varB < varA) {
			System.out.println(varC+"\n"+varB+"\n"+varA);
		}
		if (varA < varC && varC < varB) {
			System.out.println(varA+"\n"+varC+"\n"+varB);
		}
		if (varC < varA && varA < varB) {
			System.out.println(varC+"\n"+varA+"\n"+varB);
		}
		if (varB < varC && varC < varA) {
			System.out.println(varB+"\n"+varC+"\n"+varA);
		}
		
		tec.close();
	}

}
