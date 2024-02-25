

public class ContaCorrente extends Conta implements ContaRepositorio {
	
	private double limite;
	
	public ContaCorrente(String numero, int agencia, String nome, String cpf, double limite) {
		super(numero, agencia, nome, cpf);
		this.limite = limite;
		
	}
	
	public double getLimite() {
		return limite;
	}



	@Override
	 public static void cadastrar(Banco banco) {
	
		ContaCorrente conta = new ContaCorrente();
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
		
		ContaCorrente contaCorrente = new ContaCorrente(numero, agencia, nome, cpf, limite);
		   Banco.adicionarConta(conta);
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
		System.out.print("Digite o número da conta: ");
        String numero = scanner.nextLine();
        System.out.print("Digite o valor a sacar: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha

        if (banco.realizarSaque(numero, valor)) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Não foi possível realizar o saque. Verifique o saldo da conta.");
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