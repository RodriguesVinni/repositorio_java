package entidades;

public class aluno {
	
	// atributos da classe
		public String nomeAluno;
		public int anoNascimentoAluno;
		public char sexoAluno;
		public char turmaAluno;
		public double notas[] =  new double[4];  // pedreiro - peão
		public double mediaEscola;
		
		//metodos
		
		public void mostra()  // vai da nada - return
		{
			
			if (sexoAluno == 'M')
			{
				System.out.printf("O nome do aluno é %s do sexo %s", nomeAluno, sexoAluno);
			}
			else if (sexoAluno =='F')
			{
				System.out.printf("O nome da aluna é %s do sexo %s", nomeAluno, sexoAluno);
			}
			
		}
		public void mostraIdade(int anoNascimentoAluno)
		{
			System.out.printf("\nA idade do aluno é : %d",(2020-anoNascimentoAluno));
			this.anoNascimentoAluno = anoNascimentoAluno;
		}
		
		
		
		
		// metodo da media - retorna o valor da media - double
		// aprovado ou nao - ler do usuario qual a media da escola - void - texto
		
		
		
		
	}
	


