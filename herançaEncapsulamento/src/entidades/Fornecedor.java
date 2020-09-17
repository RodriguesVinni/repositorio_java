package entidades;

public class Fornecedor extends Pessoa{
	
	private double valorCredito;
	private double valorDivida;
	private  double obterSaldo;
	
		public double mostra ()
		{
		
		obterSaldo = getValorCredito()- getValorDivida();
		
		return obterSaldo;
		}
	
	public Fornecedor(String nome, String endereço, String telefone) {
		super(nome, endereço, telefone);
		
	}
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public  double obterSaldo() {
		double saldo=0;
		
		saldo= getValorCredito()- getValorDivida();
		
		return saldo;
	}

}
