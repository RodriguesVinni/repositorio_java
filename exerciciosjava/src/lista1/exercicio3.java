package lista1;

import java.util.Scanner;

/*3. Fa�a um sistema que leia o tempo de dura��o de
 *  um evento em uma f�brica expressa em segundos e mostre-o 
 *  expresso em horas, minutos e segundos.*/

public class exercicio3 {

	public static void main(String[] args) {
		
		int horas,minutos,segundos;
		
		Scanner tec = new Scanner(System.in);
				
		System.out.println("Digite a dura��o do evento em segundos: ");
		segundos = tec.nextInt();
				
		horas = segundos / 3600;
		minutos = (segundos % 3600) / 60;
		segundos = (segundos % 3600) % 60;
		
		System.out.printf("O evento durou %d horas, %d minutos e %d segundos",horas, minutos, segundos);

	}

}
