package lista1;

import java.util.Scanner;

/*2. Faça um sistema que leia a idade de uma pessoa expressa
 *  em dias e mostre-a expressa em anos, meses e dias.*/

public class exercicio2 {

	public static void main(String[] args)
	{
		int idadeDias, idadeMeses, idadeAnos;
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Digite sua idade em dias: ");
		idadeDias = tec.nextInt();
				
		idadeAnos = idadeDias / 365;
		idadeMeses = idadeDias % 365 / 30;
		idadeDias = idadeDias % 365 % 30;
		
		System.out.printf("Sua idades é de %d ano(s), %d mese(s), %d dia(s)",idadeAnos,idadeMeses,idadeDias);
		
	}

}
