package lista1;

import java.util.Scanner;

/* * 7. Um sistema de equa��es lineares do tipo: ax + by = c
 * 											     dx + ey = f		
 pode ser resolvido segundo mostrado abaixx:
 x = ce -bf				y = af - cd
  	__________			   _________	
  	ae - bd					ae - bd
  	
  	Escreva um sistema que l� os coeficientes
  	a,b,c,d,e e f e calcula e mostra os valores de x e y. */

public class exercicio7 {
	
	public static void main(String[] args)
	{
	
	double a, b, c , d, e, f, x, y;
	
	Scanner tec = new Scanner(System.in);
	
	System.out.printf("Entre com o valor de A: ");
	a = tec.nextDouble();
	System.out.printf("Entre com o valor de B: ");
	b = tec.nextDouble();
	System.out.printf("Entre com o valor de C: ");
	c = tec.nextDouble();
	System.out.printf("Entre com o valor de D: ");
	d = tec.nextDouble();
	System.out.printf("Entre com o valor de E: ");
	e = tec.nextDouble();
	System.out.printf("Entre com o valor de F: ");
	f = tec.nextDouble();
	
	x = (c * e - b * f) / (a * e - b * d);
	y = (a * f - c * d) / (a * e - b * f);
	
	System.out.printf("O valor de X � %f", x);
	System.out.printf("\nO valor de Y � %f", y);
}
}