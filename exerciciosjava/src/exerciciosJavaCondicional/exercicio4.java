package exerciciosJavaCondicional;
/*4-Fa�a um programa em que permita a entrada de um n�mero
 * qualquer e exiba se este n�mero � par ou �mpar. Se for par 
 * exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero 
 * elevado ao quadrado.*/

import java.util.*;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		double numero, raiz=0, pow;
		
		System.out.print("Digite um n�mero: ");
		numero = tec.nextInt();
		
		if (numero % 2 == 0) {
			
			raiz = (Math.sqrt(numero));
			System.out.printf("O n�mero %.0f � PAR e sua raiz quadrade � igual a: %.2f", numero, raiz);
		}
		else {
			
			pow = Math.pow(numero, 2);
			System.out.printf("O n�mero %.0f � IMPAR e elevado ao quadrado totaliza: %.2f", numero, pow);
		}
		tec.close();
	}

}
