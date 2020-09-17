package entidades;

public class Empregado extends Pessoa {
	
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
		
	public double salarioFinal()
	{
		double salarioFinal=0;
		salarioFinal = getSalarioBase() - getImposto();
		return salarioFinal;
	}
	
	public Empregado(String nome, String endere�o, String telefone, int codigoSetor) {
		super(nome, endere�o, telefone);
		this.codigoSetor = codigoSetor;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

}
