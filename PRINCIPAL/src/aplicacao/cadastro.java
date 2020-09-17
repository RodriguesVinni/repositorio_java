package aplicacao;

import entidades.Aluno;
import entidades.Pessoa;
import entidades.Professor;

public class cadastro {
	public static void main(String[] args)
	{
		System.out.println("SISTEMA DE CADASTRO:");
		
		Pessoa fulano = new Pessoa("JOAO");
		Pessoa sicrano = new Pessoa("MARIA",'F',1970);
		Aluno novoAluno = new Aluno("CARLOS", 'M',2000,"BRANCO","TURMA 8");
		Professor novoProfessor = new Professor ("Luiza", "modulo II");
		
		System.out.println(novoAluno.getTurma());
		System.out.println(novoProfessor.getNome());
	}
}	