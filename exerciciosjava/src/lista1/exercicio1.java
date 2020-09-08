package lista1;

import java.util.Scanner;

/* * 1. Faça um sistema que leia a idade de uma pessoa expressa em anos,
 *  meses e dias e mostre-a expressa apenas em dias. */

public class exercicio1 
{
	public static void main(String[] args) 
	{
		int anosIdade, mesesIdade, diasIdade, totalDias;
		
		Scanner  tec = new Scanner(System.in);
		
		System.out.println("Digite sua idade em anos: ");
		anosIdade = tec.nextInt();
		System.out.println("Digite sua idade em meses: ");
		mesesIdade = tec.nextInt();
		System.out.println("Digite sua idade em dias: ");
		diasIdade = tec.nextInt();
		
		totalDias = anosIdade * 365;
		totalDias = totalDias + (mesesIdade * 30);
		totalDias = totalDias + diasIdade;
		
		System.out.printf("Sua idade expressa em dias é de: %d dias",totalDias);
	}

}
