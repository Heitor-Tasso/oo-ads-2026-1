import java.util.Date;

public class Funcionario extends Pessoa {

    /*
     * taxaComissao é um ATRIBUTO DE CLASSE.
     * O valor de um atributo de classe é COMPARTILHADO por
     * todos os objetos criados a partir da classe que o definiu.
     * A declaração de atributos de classe é caracterizada pelo
     * uso da palavra-chave "static".
     */
    public static Double taxaComissao = 10.0;

    // Atributos
    public String matricula;
    public String cargo;
    public Double salarioBase;
    public String departamento;
    public Date dataAdmissao;

    // MÉTODO CONSTRUTOR PERSONALIZADO
    public Funcionario(
            String nome,
            Integer idade,
            String cpf,
            String email,
            String telefone,
            String matricula,
            String cargo,
            Double salarioBase,
            String departamento) {
        // Chamando o construtor da classe pai
        super(nome, idade, cpf, email, telefone);

        // Armazenando o valor dos atributos particulares da classe Funcionario
        this.matricula = matricula;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
        this.dataAdmissao = new Date();
    }

    // Métodos
    public Double calcularSalario() {
        return this.salarioBase * (1 + (taxaComissao / 100));
    }

    public void aumentarSalarioBase(Double percentual) {
        if (percentual == null || percentual <= 0) {
            throw new IllegalArgumentException("O percentual de aumento deve ser positivo.");
        }
        this.salarioBase = this.salarioBase * (1 + (percentual / 100));
        System.out.println("Salário base atualizado para R$ " + this.salarioBase);
    }

    public void registrarPonto() {
        System.out.println("Ponto registrado para " + this.nome +
                "\nMatrícula: " + this.matricula +
                "\nData/hora: " + new Date());
    }

    @Override
    public String mostrarDados() {

        /*
         * A palavra-chave "super" é uma referência à classe-base
         * (Pessoa) da classe atual (Funcionário).
         * 
         * Em vez de reescrever o método mostrarDados() do zero,
         * chamamos a versão do método implementada na classe
         * Pessoa, usando a referência "super" e, em seguida,
         * apenas completamos com as informações que são
         * particulares de Funcionario.
         * 
         * Quando uma classe redefine um método de sua classe-base,
         * como nesse caso, a versão reescrita deve ser marcada
         * com @Override.
         */
        String dadosPessoa = super.mostrarDados();
        return dadosPessoa +
                "\nMatricula: " + this.matricula +
                "\nCargo: " + this.cargo +
                "\nSalário base: R$ " + this.salarioBase +
                "\nDepartamento: " + this.departamento +
                "\nData de admissão: " + this.dataAdmissao;
    }
}
