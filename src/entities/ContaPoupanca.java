package entities;

public final class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("=== |Conta Corrente| ===");
        super.imprimirExtrato();
    }
}
