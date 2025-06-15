package entities;

public class Cliente {
    private final String name;
    private final String cpf;

    public Cliente(String name, String cpf){
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public void exibirInformacoes(){
        System.out.println("=== |Cliente| ===");
        System.out.printf("O Nome do Cliente é %s%n", this.getName());
        System.out.printf("O Cpf do Cliente é %s%n", this.getCpf());
    }
}
