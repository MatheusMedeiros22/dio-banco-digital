import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nome;
	List <Conta> contas = new ArrayList<>();
	
	
	
	public Banco(String nome) {
		this.nome = nome;
	
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void adicionarNoBanco(Conta conta) {
		contas.add(conta);
	}
	
	public void removerDoBanco(Conta conta) {
		contas.remove(conta);
	}
	
	public void imprimirContas() {
		for(Conta conta : contas) {
			System.out.println(nome);
			conta.imprimirExtrato();
			System.out.println();
		}
	}
	
}
