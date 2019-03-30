package Ex03;

public class ContaCorrenteEspecial implements Conta{

	private double saldo;
	private double taxaPorOperacao;



	@Override
	public void deposita(double valor) {
		taxaPorOperacao = valor*0.001;
		this.saldo += valor - this.taxaPorOperacao;
	}
	@Override
	public void saca(double valor) {
		taxaPorOperacao = valor*0.001;
		this.saldo -= valor + this.taxaPorOperacao;
		
	}
	@Override
	public double obterSaldo() {
		return saldo;
	}

	
}
