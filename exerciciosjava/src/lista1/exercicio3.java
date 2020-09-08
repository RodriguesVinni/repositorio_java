package lista1;

import java.util.Scanner;

/*3. Faça um sistema que leia o tempo de duração de
 *  um evento em uma fábrica expressa em segundos e mostre-o 
 *  expresso em horas, minutos e segundos.*/

public class exercicio3 {

	public static void main(String[] args) {
		
		int horas,minutos,segundos;
		
		Scanner tec = new Scanner(System.in);
				
		System.out.println("Digite a duração do evento em segundos: ");
		segundos = tec.nextInt();
				
		horas = segundos / 3600;
		minutos = (segundos % 3600) / 60;
		segundos = (segundos % 3600) % 60;
		
		System.out.printf("O evento durou %d horas, %d minutos e %d segundos",horas, minutos, segundos);

	}

}
