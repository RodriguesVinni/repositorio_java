package aplica��o;

import entidades.Empregado;
import entidades.Fornecedor;
import entidades.Pessoa;

public class AplicacaoPessoa {

	public static void main(String[] args) {
		
		System.out.println("------ APLICA��O CADASTRAL GERAL ------");
System.out.println("------------------------------------------------------------------------------------\n");		
		System.out.println("------- FORNECEDOR -------\n");
		
		Fornecedor fornecedor1 = new Fornecedor("Marina "," Rua Tut�ia ", " 5892-7744");
		Fornecedor fornecedor2 = new Fornecedor("Mahara "," Rua Rego Freitas ", " 5515-6547");
		
		fornecedor1.setValorCredito(700);;
		fornecedor1.setValorDivida(350);
		
		fornecedor2.setValorCredito(550);
		fornecedor2.setValorDivida(442);

		System.out.println(fornecedor1.getNome() + "-->" + fornecedor1.getTelefone() + " --> Saldo: R$" + fornecedor1.obterSaldo());
		System.out.println(fornecedor2.getNome() + "-->" + fornecedor2.getTelefone() + " --> Saldo: R$" + fornecedor2.obterSaldo());
		
System.out.println("------------------------------------------------------------------------------------\n");
		
System.out.println("------- EMPREGADO -------\n");

Empregado empregado1 = new Empregado("Murillo", "Rua Amodor Bueno", "4002-8922", 171157);
		
		empregado1.setSalarioBase(1018.16);
		empregado1.setImposto(180);
		
		System.out.println(empregado1.getNome() + "--> C�digo: "+ empregado1.getCodigoSetor() + "--> Sal�rio Final: R$" + empregado1.salarioFinal());
	}

}
