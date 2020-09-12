package desafiosJava;

import java.util.Random;
import java.util.Scanner;

/*
*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
*e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira 
*diagonal, ou seja, diagonal principal.
*/

public class matrizSomaDiagonal {
	
	public static void main(String[] args) {
        Random gerador = new Random ();		
		int matriz[][] = new int [3][3];
		
		final int LINHA=3;
		final int COLUNA=3; //linha e colunas constantes
		
		
		
		int linha,coluna, valorDigitado = 0, soma = 0, total = 0;
		for(linha=0; linha<LINHA; linha++)
		{
			System.out.printf(" | ");
			
			for (coluna=0; coluna<COLUNA; coluna++)
			{
				valorDigitado = gerador.nextInt(3)+1;
				matriz[linha][coluna] = valorDigitado;
				
				// escreva("Matriz [",l,"][",c,"] :", matriz[l][c])
			
				System.out.print(matriz[linha][coluna]);
				System.out.print(" | ");
				//somatorio
				total = total + matriz[linha][coluna];
								//calcula a diagonal
				if (linha==coluna)
				{
					soma = soma + matriz[linha][coluna];
				}
				
			}
			System.out.print("\n");
		}
		System.out.printf("Soma da diagonal principal é : %d", soma);
		
	}
}






