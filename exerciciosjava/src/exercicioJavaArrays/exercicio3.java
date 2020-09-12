package exercicioJavaArrays;

import java.util.Scanner;

//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

public class exercicio3 {

	public static void main(String[] args) {
		
		int [][] matriz = new int [3][3];
		int contMaior10 = 0;
		
		Scanner tec = new Scanner(System.in);		
		System.out.println("Matriz [3][3]\n");
		
		for(int linha=0 ; linha<3 ; linha++) 
		{
			for(int coluna=0 ; coluna<3 ; coluna++) 
			{
			System.out.printf("Insira o elemento M[%d][%d]: ", linha+1, coluna+1);
			 matriz[linha][coluna]=tec.nextInt();
			 
			}
		}
		for(int linha=0 ; linha<3 ; linha++) 
		{
			for(int coluna=0 ; coluna<3 ; coluna++) 
			{
				System.out.printf("[%d]", matriz[linha][coluna]);	
				
				if (matriz[linha][coluna] > 10) 
				{
					contMaior10++;
				}	
			}		
		}
		System.out.printf("\n\nA matriz possui %d numeros maiores que 10.\n\n", contMaior10);
		tec.close();		
	}

}
