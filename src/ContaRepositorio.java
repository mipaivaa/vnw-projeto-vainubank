
public interface ContaRepositorio {

	public interface Contarepositorio {
		
		void cadastrar(Conta conta);
		Conta procurarPorNumero(String numero);
		Conta listarTodas();
		void atualizar(String numero);
		
		boolean sacar(double valor);
		boolean depositar(double valor);
		boolean transferir(double valor);
	}
	
	 public Banco() {
	        this.contas = new ArrayList<>();
	    }
	
}
