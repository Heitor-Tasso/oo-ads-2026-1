public class ContaEspecial extends ContaBancaria {
    // Atributo específico da conta especial
    public double limiteDisponivel;

    // Construtor para inicializar a conta especial com limite
    public ContaEspecial(
            String titularConta,
            Double saldoInicial,
            Double limiteDisponivel) {
        super(titularConta, saldoInicial); // Chama construtor da classe pai
        this.limiteDisponivel = limiteDisponivel;
    }

    @Override
    // Método para exibir saldo incluindo o limite disponível
    public void exibirSaldo() {
        System.out.println("Titular da Conta: " + getTitularConta());
        System.out.println("Saldo com Limite: R$ " + (getSaldo() + limiteDisponivel));
    }

    // Método para exibir apenas o saldo real sem o limite
    public void exibirSaldoReal() {
        System.out.println("Titular da Conta: " + getTitularConta());
        System.out.println("Saldo Real: R$ " + getSaldo());
    }
}
