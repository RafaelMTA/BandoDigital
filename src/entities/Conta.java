package entities;

import exceptions.InsufficientFundsValidatorException;
import exceptions.NegativeValueValidatorException;
import interfaces.IConta;
import utils.ContaUtils;

public abstract class Conta implements IConta {
    protected final int agencia;
    protected final int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = ContaUtils.gerarNumeroAgencia();
        this.numero = ContaUtils.gerarNumeroConta();
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor) throws NegativeValueValidatorException{
        if(valor < 0) throw new NegativeValueValidatorException("Valor a ser depositado não pode ser negativo");
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) throws InsufficientFundsValidatorException {
        if(valor > this.saldo) throw new InsufficientFundsValidatorException("Saldo insuficiente");
        this.saldo -= valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino){
        try {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
            ex.getStackTrace();
        }
    }

    @Override
    public void imprimirExtrato(){
        System.out.printf("O número da agência é: %s%n", this.agencia);
        System.out.printf("O número da conta é: %s%n", this.numero);
        System.out.printf("O saldo é: %s%n", this.saldo);
        System.out.printf("O Nome do Cliente é: %s%n", this.cliente.name());
    }
}
