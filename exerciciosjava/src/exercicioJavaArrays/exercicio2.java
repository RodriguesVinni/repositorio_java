package exercicioJavaArrays;
/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre:
� Os n�meros pares digitados;
� A soma dos n�meros pares digitados; ok
� Os n�meros �mpares digitados;
� A quantidade de n�meros �mpares digitados. ok*/
import java.util.Scanner;
public class exercicio2 {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		int [] num = new int [6];
		int i, somaPar = 0, contImpar = 0, impar=0;
				
		for ( i=0 ; i<6 ; i++) {
			
			System.out.printf("Informe o %d� numero: ",i+1);
		    num[i]=tec.nextInt();
			
		    if (num[i] % 2 == 0){
		    	
		    	somaPar=somaPar+num[i];		   
		    }
		    else if (num[i] % 2 != 0) {
		    	contImpar++;
		    	
		    }
		    
		    
		}	
		System.out.printf("A soma dos n�meros pares �: %d",somaPar);
		System.out.printf("\nA quantidade de numeros impares digitados foi: %d",contImpar);
	
		tec.close();
	}
}