package exerciciosJavaCondicional;

/*3-	Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
·10-14 infantil
·15-17 juvenil
·18-25 adulto*/

import java.util.*;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite a idade: ");
		idade = tec.nextInt();
		
		if (idade <= 14) {
			System.out.println("\nSua categoria é Infantil");
		}
		else if (idade > 14 && idade <=17) {
			System.out.println("\nSua catedoria é Juvenil");
		}
		else if (idade > 17 && idade <=25) {
			System.out.println("\nSua categoria é Adulto");
		}
		
		tec.close();
	}

}
