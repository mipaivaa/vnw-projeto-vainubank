import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public Conta buscarConta(String numero) {
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numero)) {
                return conta;
            }
        }
        return null;
    }

    public List<Conta> listarContas() {
        return this.contas;
    }

    public boolean removerConta(String numero) {
        Conta conta = buscarConta(numero);
        if (conta != null) {
            this.contas.remove(conta);
            return true;
        }
        return false;
    }
}
