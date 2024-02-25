
public class ContaPoupança extends Conta implements ContaRepositorio{
	
	private int aniversario;
	
	public ContaPoupanca(String numero, int agencia, String nome, String cpf, int aniversario) {
		super(numero, agencia, nome, cpf);
		this.aniversario = aniversario;
	}
	
    public int getAniversario() {
    	return aniversario;
    }
    
    @Override
    public void cadastrar(Banco banco) {
    	CContaPoupanca contaPoupanca = new ContaPoupanca(numero, agencia, nome, cpf, aniversario);
		System.out.print("Digite o número da conta: ");
		int numero = input.nextInt();
		Conta.setNumero(numero);
		input.nextLine();
		
		System.out.print("Digite a agência:");
		String agencia = input.nextLine();
        Conta.setAgencia(agencia);
		
		System.out.print("Digite o nome do titular:";
		String nomeTitular = input.nextLine();
		conta.setNome(nomeTitular);
		
		System.out.print("Digite o CPF:");
		String cpf = input.nextLine();
		conta.setcpf(cpf);
		
		
		banco.adicionarConta(contaCorrente);
	        System.out.println("Conta corrente criada com sucesso.");
	}
	
	
	@Override
	public void Conta listarTodas() {
		System.out.println("===== TODAS AS CONTAS =====");
        List<Conta> contas = banco.getContas();
        for (Conta conta : contas) {
            System.out.println(conta);
        }
	}
	
	@Override
	public void Conta procurarPorNumero(String numero) {
		System.out.print("Digite o número da conta: ");
        String numero = scanner.nextLine();
        Conta conta = banco.buscarConta(numero);
        if (conta != null) {
            System.out.println("Conta encontrada:");
            System.out.println(conta);
        } else {
            System.out.println("Conta não encontrada.");
        }
	}
	
	
	@Override
	public void Conta atualizar(String numero) {
		
	}
	
	@Override
	public void sacar(Banco banco) {
		 // Calcula os juros de 2% sobre o valor do saque
        double juros = valor * 0.02;
        double valorTotal = valor + juros;

        if (valorTotal <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - valorTotal);
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            System.out.println("Juros de R$ " + juros + " aplicados.");
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
		return false;
		
	}
	@Override
	public void depositar(Banco banco) {
		 System.out.print("Digite o número da conta: ");
	        String numero = scanner.nextLine();
	        System.out.print("Digite o valor a depositar: ");
	        double valor = scanner.nextDouble();
	        scanner.nextLine(); // Consumir a quebra de linha

	        if (banco.realizarDeposito(numero, valor)) {
	            System.out.println("Depósito realizado com sucesso!");
	        } else {
	            System.out.println("Não foi possível realizar o depósito. Verifique os dados da conta.");
	        }
	    }
	

	@Override
	public void transferir(Banco banco) {
		System.out.print("Digite o número da conta de origem: ");
        String numeroOrigem = scanner.nextLine();
        System.out.print("Digite o número da conta de destino: ");
        String numeroDestino = scanner.nextLine();
        System.out.print("Digite o valor a transferir: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha

        if (banco.realizarTransferencia(numeroOrigem, numeroDestino, valor)) {
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Não foi possível realizar a transferência. Verifique os dados das contas.");
        }
	}
}
