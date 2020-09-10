package desafiosJava;

import java.util.Scanner;

public class masculinoFeminino {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int opcao;
		
		System.out.print("Digite um número para seu respectivo genero: (1) Masc. (2) Femin. (3)Outros");
		opcao=tec.nextInt();
		/*System.out.println("Digite (1) para Masculino: ");
		masc = tec.nextInt();
		System.out.println("Digite (1) para Feminino: ");
		fem = tec.nextInt();
		System.out.println("Digite (3) para Outros: ");
		outros = tec.nextInt();*/
		
		System.out.print ((opcao == 1) ? "Masculino" : (opcao== 2) ? "Feminino" : (opcao == 3) ? "Outros": "Opção invalida");
		
		tec.close();
	}

}
