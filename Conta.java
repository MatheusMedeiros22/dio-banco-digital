
public abstract class Conta implements IConta {
	
	protected static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public void sacar(double valor) {
		if(valor > saldo) {
			System.out.println("Saldo indisponivel");
			return;
		}
		this.saldo -= valor;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		if(valor > saldo) {
			System.out.println("Saldo indisponivel");
			return;
		}
		
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public void imprimirExtrato() {
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Numero da Conta: " + this.numero);
		System.out.println("Cliente: " + getCliente().getNome());
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		
	}
	
	public int getAgencia() {
		return agencia;
	}

	
	public double getNumero() {
		return numero;
	}


	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	
	
}
