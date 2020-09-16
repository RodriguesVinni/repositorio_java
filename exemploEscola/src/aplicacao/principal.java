package aplicacao;

import java.util.Scanner;

import entidades.aluno;

public class principal {

	public static void main(String[] args) {
		
		System.out.println("SISTEMA DE CONTROLE ESCOLA EM JAVA - POO");
		
		//primeiro passo - atributos
		//CRIEM UMA CLASSE  ALUNO - pacote --> entidades
		//nomeAluno[texto], anoNascimentoAluno[numero inteiro],
		//sexoAluno[caracer],
		//turmaAluno [caracter],
		
		Scanner leia = new Scanner(System.in); // instanciei o teclado
		aluno alunoExemplo = new aluno(); // instanciei o aluno  //
		int ano;
								
		System.out.print("Digite o nome do aluno: ");
		alunoExemplo.nomeAluno = leia.next().toUpperCase();
		
		System.out.print("Sexo aluno [M/F]:");
		alunoExemplo.sexoAluno = leia.next().toUpperCase().charAt(0);
		
		System.out.print("Digite a nota 1 :");
		alunoExemplo.notas[0] = leia.nextDouble();
	
		System.out.print("Digite o ano de nascimento: ");
		ano = leia.nextInt();
		
		System.out.println("Digite a média de corte escolar:");
		alunoExemplo.mediaEscola = leia.nextDouble();
		
			
		alunoExemplo.mostraIdade(ano);
		System.out.println("");
		System.out.println(alunoExemplo.anoNascimentoAluno);
		
					
			
		
		leia.close();
	}
		

}


