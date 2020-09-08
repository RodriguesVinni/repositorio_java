package lista1;

import java.util.Scanner;

/*5. Faça um sistema que leia as 3 notas de um aluno
 * e calcule a média final deste aluno. Considerar que
 *a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. */

public class exercicio5 {

	public static void main(String[] args) {
		
		double notaA, notaB, notaC, mediaPonderada;
		
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Digite a primeira Nota: ");
		notaA = tec.nextDouble();
		System.out.print("Digite a segunda Nota: ");
		notaB = tec.nextDouble();
		System.out.print("Digite a terceira Nota: ");
		notaC = tec.nextDouble();
		
		mediaPonderada = ((notaA*2)+(notaB*3)+(notaC*5))/10;
		System.out.printf("A média final do aluno é de %.2f",mediaPonderada);

	}

}
