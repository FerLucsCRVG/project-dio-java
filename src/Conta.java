
public abstract class Conta {
	private String nome;
	private String numeroConta;
	private Double saldo;
	
	public Conta(String nome, String conta) {
		super();
		this.nome = nome;
		this.numeroConta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setConta(String conta) {
		this.numeroConta = conta;
	}

	public Double getSaldo() {
		return saldo;
	}

	
	public void sacar(Double valor) {
		if(valor > 0 && valor >= saldo) {
			saldo -= valor;
		}
	}
	
	public void depositar(Double valor) {
		saldo += valor;
	}
	
	public void transferirConta(Conta c,Double valor) {
		if(valor > 0 && valor >= saldo) {
			c.depositar(valor);
			saldo-=valor;
		}
	}
	

}
