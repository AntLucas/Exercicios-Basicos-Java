package Ex03;

public class TesteContas {
public static void main(String[]args) {
	ContaCorrente c1 = new ContaCorrente();
	ContaCorrenteEspecial c2 = new ContaCorrenteEspecial();
	
	c1.deposita(500);
	c2.deposita(500);
	
	c1.saca(100);
	c2.saca(100);
	
	System.out.println(c1.obterSaldo());
	System.out.println(c2.obterSaldo());
}
}
