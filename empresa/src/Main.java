public class Main {
    public static void main(String[] args) {
        teste01();
        teste02();
        teste03();
    }

    public static void teste01() {
        // Criação do primeiro objeto de pessoa usando o construtor
        Pessoa pessoa1 = new Pessoa(
                "Gervásio Gomes Garcia",
                54,
                "123.456.789-01",
                "gervasio.garcia@empresa.com.br",
                "(16) 98765-4321");

        // Chamando o método para exibir os dados da pessoa 1
        System.out.println(pessoa1.mostrarDados());

        System.out.println("-".repeat(80));

        pessoa1.fazerAniversario();

        // Chamando a apresentação da pessoa, que reflete a nova idade
        pessoa1.apresentar();

        System.out.println("-".repeat(80));

        // Atualizando o e-mail
        pessoa1.atualizarEmail("ggarcia@outlook.com");

        System.out.println("-".repeat(80));

        // Exibindo novamente os dados para conferir as alterações feitas
        System.out.println(pessoa1.mostrarDados());

        // Alterando novamente o e-mail por meio de manipulação direta
        // do valor do atributo
        pessoa1.email = "garcia.gervasio@bol.com.br";

        System.out.println("-".repeat(80));

        // Exibindo novamente os dados para conferir as alterações feitas
        System.out.println(pessoa1.mostrarDados());

        System.out.println("*".repeat(80));

        // Vamos criar o primeiro objeto da classe Funcionario usando o construtor
        Funcionario func1 = new Funcionario(
                "Veneranda Vieira",
                26,
                "987.654.321-09",
                "veneranda@empresa.com.br",
                "(36) 91234-5678",
                "F0123",
                "Assistente Financeiro",
                3500.00,
                "Gerência Financeira");

        // Exibindo os dados do funcionário
        System.out.println(func1.mostrarDados());

        System.out.println("-".repeat(80));

        func1.fazerAniversario();

        // Exibindo os dados novamente para verificar mudança de idade
        System.out.println(func1.mostrarDados());

        System.out.println("-".repeat(80));

        // Calculando o salário de Veneranda
        Double salarioFinal = func1.calcularSalario();
        System.out.println("O salário final de Veneranda é R$ " + salarioFinal);
    }

    public static void teste02() {
        // Espaço reservado para testes adicionais
    }

    public static void teste03() {
        // Instanciando três contas bancárias simples
        ContaBancaria conta1 = new ContaBancaria("Heitor", 1000.0);
        ContaBancaria conta2 = new ContaBancaria("Marina", 2000.0);
        ContaBancaria conta3 = new ContaBancaria("Rafael", 5000.0);

        // Realizando operações na conta 1
        conta1.depositar(200.0);
        conta1.sacar(150.0);

        // Realizando operações na conta 2
        conta2.depositar(300.0);
        conta2.sacar(100.0);

        // Realizando operações na conta 3
        conta3.sacar(500.0);
        conta3.depositar(1000.0);

        // Exibindo informações das contas bancárias
        System.out.println("\n--- Conta Bancária 1 ---");
        conta1.exibirSaldo();

        System.out.println("\n--- Conta Bancária 2 ---");
        conta2.exibirSaldo();

        System.out.println("\n--- Conta Bancária 3 ---");
        conta3.exibirSaldo();

        // Instanciando três contas especiais com limite
        ContaEspecial contaE1 = new ContaEspecial("Heitor", 1000.0, 500.0);
        ContaEspecial contaE2 = new ContaEspecial("Beatriz", 2000.0, 500.0);
        ContaEspecial contaE3 = new ContaEspecial("Carlos", 5000.0, 450.0);
        // Realizando operações na conta especial 1
        contaE1.depositar(200.0);
        contaE1.sacar(100.0);
        // Realizando operações na conta especial 2
        contaE2.depositar(250.0);
        contaE2.sacar(100.0);
        // Realizando operações na conta especial 3
        contaE3.depositar(300.0);
        contaE3.sacar(160.0);

        // Exibindo informações das contas especiais
        System.out.println("\n--- Conta Especial 1 ---");
        contaE1.exibirSaldoReal();
        contaE1.exibirSaldo();

        System.out.println("\n--- Conta Especial 2 ---");
        contaE2.exibirSaldoReal();
        contaE2.exibirSaldo();

        System.out.println("\n--- Conta Especial 3 ---");
        contaE3.exibirSaldoReal();
        contaE3.exibirSaldo();
    }
}
