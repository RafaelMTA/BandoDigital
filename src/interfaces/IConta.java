package interfaces;

public interface IConta {
    void sacar(double valor) throws RuntimeException;
    void depositar(double valor) throws RuntimeException;
    void transferir(double valor, IConta contaDestino);
    void imprimirExtrato();
}
