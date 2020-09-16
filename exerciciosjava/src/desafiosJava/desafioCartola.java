package desafiosJava;

import java.util.Scanner;

public class desafioCartola {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		 
		String vTime [] = {"Corinthians", "Palmeiras", "Santos", "São Paulo"};
		int vPontos1 [] = new int [4];
		int vPontos2 [] = new int [4];
		int vPontos3 [] = new int [4];
		int  i = 0;
		
		
			
		System.out.println(i);	
						
		
		
		for ( int indice =0 ; indice <4 ; indice ++  ) {
			
			System.out.printf("Digite a pontuação do %s na %dº rodada: ",vTime[i],vPontos1 [indice] + 1 );
			vPontos1[indice]=tec.nextInt();
		}
		
				
		
		
	}

}
