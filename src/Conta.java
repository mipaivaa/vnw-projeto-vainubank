
public abstract class Conta {
	
	private String numero;
	private int agencia;
	private String nome;
	private double saldo;
	private double cpf;
	
	public Conta(String numero, int agencia, String nome,double cpf) {
		this.numero = numero;
		this.agencia =agencia;
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = 0.0;
	}

	public Sring getNumero() {
		return numero;
	}

	public void setNumero(Sring numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Sring getNome() {
		return nome;
	}

	public void setNome(Sring nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getcpf() {
		return cpf;
	}

	public void setcpf(double cpf) {
		this.cpf = cpf;
	}
	
	

}
