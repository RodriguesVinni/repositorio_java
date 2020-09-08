package hellojava;

import java.util.Scanner;

public class informacoes_cadastrais 
{
	public static void main(String[] args)
	{
		//
		String nome, curso;
		int anoNascimento, idade;
		curso = "Generation";
		
		
		Scanner kb = new Scanner(System.in); // criar o teclado
		
		System.out.print("Escreva o nome do usuário: ");
		nome = kb.next();
		System.out.println("O nome do usuário é " +nome);
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = kb.nextInt();
		idade = (2020 - anoNascimento) ;
		System.out.printf("Oi %s, vc é aluno da %s a sua idade é %d anos",nome, curso, idade);

	
		kb.close(); //quiser fecha o teclado
	}


}
