
public class Main {

	public static void main(String[] args) {
		
		Cliente c = new Cliente();
		Cliente c2 = new Cliente();
		c.setNome("Matheus");
		c2.setNome("Medeiros");
		
		
		Conta cc = new ContaCorrente(c);
		Conta poupanca = new ContaPoupanca(c2);
		cc.depositar(100);
		
		cc.transferir(110, poupanca);
		poupanca.sacar(10);
		System.out.println();

		Banco banco = new Banco("Itau Unibanco");
		
		banco.adicionarNoBanco(cc);
		banco.adicionarNoBanco(poupanca);
		banco.imprimirContas();
		
	}

}
