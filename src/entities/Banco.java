package entities;

import exceptions.NullEntityValidatorException;
import utils.BancoUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Banco {
    private final int codigo;
    private final String nome;
    private List<Conta> contas;

    public Banco(String nome){
        this.codigo = BancoUtils.gerarNumero();
        this.nome = nome;
        contas = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarConta(Conta conta) throws NullEntityValidatorException {
        if(contas == null) throw new NullEntityValidatorException("A lista de contas não pode ser nulo");

        contas.add(conta);
    }

    public void exibirInformacoes(){
        System.out.println("=== |Banco| ===");
        System.out.printf("O Código do Banco é %s%n", this.getCodigo());
        System.out.printf("O Nome do Banco é %s%n", this.getNome());
    }

    public List<Conta> selecionarContasPorCliente(Cliente cliente){
        return this.contas.stream().filter(x -> Objects.equals(x.cliente, cliente)).toList();
    }
}
