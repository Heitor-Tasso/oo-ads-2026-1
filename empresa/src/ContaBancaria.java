public class ContaBancaria {
    // Atributos da conta
    public Double saldo;
    public String titularConta;

    // Construtor para inicializar a conta bancária
    public ContaBancaria(
            String titularConta,
            Double saldoInicial) {
        this.titularConta = titularConta;
        this.saldo = saldoInicial;
    }

    // Método para realizar depósito na conta
    public void depositar(Double quantia) {
        saldo += quantia;
    }

    // Método para realizar saque da conta
    public void sacar(Double quantia) {
        saldo -= quantia;
    }

    // Método para exibir informações da conta
    public void exibirSaldo() {
        System.out.println("Titular da Conta: " + titularConta);
        System.out.println("Saldo Atual: R$ " + saldo);
    }

    // Getter para obter o saldo (utilizado pelas subclasses)
    public Double getSaldo() {
        return saldo;
    }

    // Getter para obter o titular (utilizado pelas subclasses)
    public String getTitularConta() {
        return titularConta;
    }
}
