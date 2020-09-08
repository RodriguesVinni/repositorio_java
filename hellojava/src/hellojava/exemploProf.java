package hellojava;
import java.util.Scanner;

public class exemploProf {
	public static void main(String[] args) {
		
		
		
		String nomeUsuario;
		int  idadeUsuario;
		double alturaUsuario;
		boolean situacaoUsuario = true;
		
		Scanner kb = new Scanner(System.in);
		
		
		nomeUsuario = "Godoy";
		idadeUsuario = 20;
		alturaUsuario = 1.8335879;  //no padrão americano ponto é virgula
		situacaoUsuario = true;
		
		
		
		
		System.out.println("O usuario " + nomeUsuario + " tem " + idadeUsuario + " anos e tem " + (alturaUsuario+1.20));
		//System.out.println("-------------------------------------------------------------");
		System.out.printf("O usuario %s tem %d anos e tem %.2f", nomeUsuario, idadeUsuario, (alturaUsuario+1.20) );
		System.out.println("\n----------------- novos testes --------------------------");
		System.out.println("");
		System.out.print("Digite o nome do usuario: ");
		nomeUsuario = kb.next();
		System.out.println("Digite a idade: ");
		idadeUsuario = kb.nextInt();
		System.out.println("Digite a altura");
		alturaUsuario = kb.nextDouble();
		
		
		System.out.printf("O nome do usuario agora é %s, sua idade é %d anos e tem %f altura", nomeUsuario, idadeUsuario, alturaUsuario);
		
			
		kb.close(); // para fecha o teclado - não é obrigatorio
	}
}

