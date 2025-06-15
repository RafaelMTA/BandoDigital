# 🏦 Projeto Banco Digital
Este projeto implementa um sistema bancário digital utilizando Java e princípios de Programação Orientada a Objetos (POO). Foi desenvolvido como parte de um desafio de programação para demonstrar conceitos de POO. 🚀

## ✨ Funcionalidades
- Dois tipos de contas: Corrente (Conta Corrente) e Poupança (Conta Poupança)
- Operações bancárias básicas:
  - Depósitos 💰
  - Saques 🏧
  - Transferências entre contas 🔄
- Sistema de gerenciamento de contas 📊
- Gerenciamento de clientes 👤
- Geração automática de números de conta e agência 🔢

## 🧠⚙️ Conceitos de POO Aplicados
### 🔍 Abstração
- Classe abstrata `Conta` define a estrutura básica das contas bancárias
- Interfaces como `IConta` definem comportamentos contratuais 📜

### 🔒 Encapsulamento
- Atributos protegidos nas classes de conta
- Atributos privados na classe de cliente 🔒
- Métodos públicos para acesso controlado aos dados 🛡️

### 🧬 Herança
- `ContaCorrente` e `ContaPoupanca` herdam de `Conta`
- Reuso de funcionalidades comuns de contas 🧬

### 🎭 Polimorfismo
- Operações de conta através da interface `IConta`
- Diferentes tipos de conta tratados uniformemente através da classe base 🎭

## ⚠️ Tratamento de Exceções
O sistema inclui exceções personalizadas para:
- Validação de entidade nula 🚫
- Validação de valor negativo ➖
- Validação de fundos insuficientes 💸

## 📂 Estrutura do Projeto
- `entities/`: Classes de negócio principais
- `interfaces/`: Contratos para implementação
- `exceptions/`: Classes de exceção personalizadas
- `utils/`: Classes utilitárias para geração de números

## 💡 Exemplo de Uso
```java
Banco banco = new Banco("Digi Banco");
Cliente cliente = new Cliente("Carlos", "111.111.111-11");
Conta contaCorrente = new ContaCorrente(cliente);
Conta contaPoupanca = new ContaPoupanca(cliente);

banco.adicionarConta(contaCorrente);
banco.adicionarConta(contaPoupanca);

contaCorrente.depositar(1000);
contaCorrente.transferir(100, contaPoupanca); 