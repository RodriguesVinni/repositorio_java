package lista1;

import java.util.Scanner;

/* 6. Construa um programa em c que, tendo como dados de
 * entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2),
 * escreva a distância entre eles. A fórmula que efetua tal cálculo é:
 *  d = Raiz(x2 + x1)² + (y2 + y1)² */

public class exercicio6 {

	public static void main(String[] args) {
		
		double x1, y1, x2, y2, distancia;
		
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Entre com o valor de x1: ");
		x1 = tec.nextDouble();
		System.out.print("Entre com o valor de y1: ");
		y1 = tec.nextDouble();
		System.out.print("Entre com o valor de x2: ");
		x2 = tec.nextDouble();
		System.out.print("Entre com o valor de y2: ");
		y2= tec.nextDouble();
		
		distancia = (Math.sqrt (Math.pow((x2 + x1),2) + Math.pow ((y2 + y1),2)));
		System.out.printf("A distância entre os pontos é de %.2f",distancia);
		
		tec.close();
	}

}
