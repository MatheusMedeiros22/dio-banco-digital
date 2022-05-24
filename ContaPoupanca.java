
public class ContaPoupanca extends Conta {



	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sacar(double valor) {
		super.sacar(valor);
	}

	@Override
	public void depositar(double valor) {
		super.depositar(valor);

	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		super.transferir(valor, contaDestino);

	}

	@Override
	public void imprimirExtrato() {
		System.out.println("*** Extrato Conta Poupança ***");
		super.imprimirExtrato();
	}

}
