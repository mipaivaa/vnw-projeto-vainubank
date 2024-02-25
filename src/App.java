import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App{

	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();

        int opcao;
        do {
        	System.out.println("BEM VINDO AO VAI NU BANK:");
        	System.out.println("Selecione opção desejada:");
        	System.out.println("======CRIAR CONTA=======:");
            System.out.println("1 - Criar conta corrente");
            System.out.println("2 - Criar conta poupança");
            System.out.println("----------------------------:");
            System.out.println("======CONTA EXISTENTE=======:");
            System.out.println("***CONTA CORRENTE***:");
            System.out.println("3 - Sacar");
            System.out.println("4 - Depositar");
            System.out.println("5 - Transferir");
            System.out.println("***CONTA POUPANÇA***:");
            System.out.println("6 - Sacar");
            System.out.println("7 - Depositar");
            System.out.println("8 - Transferir");
            System.out.println("9 - Sair");

            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                	ContaCorrente.cadastrar(banco);
                    break;
                case 2:
                	ContaPoupança.cadastrar(banco);
                    break;
                case 3:
                    ContaCorrente.sacar(banco);
                    break;
                case 4:
                	ContaCorrente.depositar(banco);
                    break;
                case 5:
                	ContaCorrente.transferir(banco);
                    break;
                case 6:
                	ContaPoupança.sacar(banco);
                    break;
                case 7:
                	ContaPoupança.depositar(banco);
                    break;
                case 8:
                	ContaPoupança.transferir(banco);
                    break;
                case 9:
                    System.out.println("Sistema finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 9);

        scanner.close();
    }

    
	   
}