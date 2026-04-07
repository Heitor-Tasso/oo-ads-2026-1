public class Estudante extends Pessoa {

    // Atributos
    public String nomeDoCurso;
    public Double notaPrimeiroBimestre = 0.0;
    public Double notaSegundoBimestre = 0.0;

    // MÉTODO CONSTRUTOR PERSONALIZADO
    public Estudante(
            String nome,
            Integer idade,
            String cpf,
            String email,
            String telefone,
            String nomeDoCurso,
            Double notaPrimeiroBimestre,
            Double notaSegundoBimestre) {
        // Chamando o construtor da classe pai
        super(nome, idade, cpf, email, telefone);

        if (nomeDoCurso == null || nomeDoCurso.isEmpty()) {
            throw new IllegalArgumentException("O nome do curso não pode ser vazio.");
        }

        // Armazenando o valor dos atributos particulares da classe Estudante
        this.nomeDoCurso = nomeDoCurso;
        this.notaPrimeiroBimestre = notaPrimeiroBimestre;
        this.notaSegundoBimestre = notaSegundoBimestre;
    }

    // Métodos
    public Double mediaFinal() {
        return (this.notaPrimeiroBimestre + this.notaSegundoBimestre) / 2;
    }

    public String verificarAprovacao() {
        String resultado = this.mediaFinal() >= 6.0 ? "APROVADO" : "REPROVADO";
        System.out.println(
                "Resultado final para " + this.nome + ": " + resultado + "\nMédia final: " + this.mediaFinal());
        return resultado;
    }

    @Override
    public String mostrarDados() {
        String dadosPessoa = super.mostrarDados();
        return dadosPessoa +
                "\nCurso: " + this.nomeDoCurso +
                "\nNota do primeiro bimestre: " + this.notaPrimeiroBimestre +
                "\nNota do segundo bimestre: " + this.notaSegundoBimestre +
                "\nMédia final: " + this.mediaFinal() +
                "\nSituação: " + this.verificarAprovacao();
    }
}
