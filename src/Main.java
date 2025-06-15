import entities.Banco;
import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {
    public static void main(String[] args){
        Banco banco = new Banco("Digi Banco");
        banco.exibirInformacoes();

        Cliente cliente_1 = new Cliente("Carlos", "111.111.111-11");
        cliente_1.exibirInformacoes();

        Cliente cliente_2 = new Cliente("Eliana", "222.222.222-22");
        cliente_2.exibirInformacoes();

        Conta cliente_1_corrente = new ContaCorrente(cliente_1);
        Conta cliente_1_poupanca = new ContaPoupanca(cliente_1);

        Conta cliente_2_corrente = new ContaCorrente(cliente_2);
        Conta cliente_2_poupanca = new ContaPoupanca(cliente_2);

        banco.adicionarConta(cliente_1_corrente);
        banco.adicionarConta(cliente_1_poupanca);

        banco.adicionarConta(cliente_2_corrente);
        banco.adicionarConta(cliente_2_poupanca);

        cliente_1_corrente.depositar(1000);
        cliente_1_corrente.transferir(100, cliente_1_poupanca);
        cliente_1_corrente.transferir(150, cliente_2_poupanca);
        cliente_1_corrente.transferir(200, cliente_2_corrente);

        cliente_2_corrente.depositar(500);
        cliente_2_corrente.transferir(200, cliente_2_poupanca);
        cliente_2_corrente.transferir(100, cliente_1_poupanca);
        cliente_2_corrente.transferir(100, cliente_1_corrente);

        //Seleciona todas as contas do cliente em específico e exibe os extratos
        banco.selecionarContasPorCliente(cliente_1).forEach(Conta::imprimirExtrato);
        banco.selecionarContasPorCliente(cliente_2).forEach(Conta::imprimirExtrato);
    }
}