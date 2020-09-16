package exercicio1Cliente;

import java.util.Scanner;

public class principalCliente {

	public static void main(String[] args) {
		
		System.out.println("SISTEMA DE CONTROLE DE CLIENTES - POO \n");
		
		Scanner tec = new Scanner(System.in);
		
		cliente cliente1 = new cliente(); // instanciei o aluno
		int idade;
		
		System.out.print("Digite o nome do(a) Cliente: ");
		cliente1.nomeCliente=tec.next().toUpperCase();
		
		System.out.print("Digite a Idade: ");
		idade = tec.nextInt();
		
		System.out.print("Sexo do cliente (M) para Masculino / (F) para Feminino:");
		cliente1.sexoCliente = tec.next().toUpperCase().charAt(0);
		
		System.out.print("Digite o serviço que o cliente realizou (1) Unhas / (2) Corte de Cabelo / (3) Depilação: ");
		cliente1.servico=tec.nextInt();
		
		
		
		System.out.printf("\n");
		cliente1.mostra();
		cliente1.mostrarAnoNascimento(idade);
		cliente1.mostrarServico();
		
		tec.close();
	}

}
