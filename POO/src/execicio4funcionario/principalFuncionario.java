package execicio4funcionario;

import java.util.Scanner;


public class principalFuncionario {

	public static void main(String[] args) {
		
		System.out.println("SISTEMA DE CONTROLE DE FUNCIONÁRIOS - POO \n");
		
		Scanner tec = new Scanner(System.in);
		
		funcionario funcionario1 = new funcionario(); // instanciei o aluno
		int idade;
		
		System.out.print("Digite o nome do(a) Funcionario: ");
		funcionario1.nomeFuncionario=tec.next().toUpperCase();
		
		System.out.print("Digite a Idade: ");
		idade = tec.nextInt();
		
		System.out.print("Sexo do funcionario (M) para Masculino / (F) para Feminino:");
		funcionario1.sexoFuncionario = tec.next().toUpperCase().charAt(0);
		
		System.out.print("Digite o cargo --> (1) DEV Jr. / (2) Faxineiro(a) / (3) Advogado(a): ");
		funcionario1.servico=tec.nextInt();
		
		
		
		System.out.printf("\n");
		funcionario1.mostra();
		funcionario1.mostrarAnoNascimento(idade);
		funcionario1.mostrarServico();
		
		tec.close();
	}

}