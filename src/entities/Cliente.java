package entities;

public record Cliente(String name, String cpf) {

    public void exibirInformacoes() {
        System.out.println("=== |Cliente| ===");
        System.out.printf("O Nome do Cliente é %s%n", this.name());
        System.out.printf("O Cpf do Cliente é %s%n", this.cpf());
    }
}
