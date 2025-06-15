package entities;

public final class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("=== |Conta Poupança| ===");
        super.imprimirExtrato();
    }
}
