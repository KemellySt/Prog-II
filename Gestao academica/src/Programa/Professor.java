package Programa;

public class Professor{
    
    private String titualacao;
    private String areaP;
    private Curso curso;
    private Funcionario funcionario;


    public Professor(String titulacao, String areaP, String nome, String cpf, String endereco, String telefone, String ctps, Double salario, String nomeDocurso, String disciplinas, int codigo, String descricao){

        this.funcionario = new Funcionario(nome, cpf, endereco, telefone, ctps, salario);
        this.curso = new Curso(nomeDocurso, disciplinas, codigo, descricao);
        this.titualacao = titulacao;
        this.areaP = areaP;

    }
    
    public Professor(String titulacao, String areaP, String nomeDocurso, String disciplinas, int codigo, String descricao){

        this.curso = new Curso(nomeDocurso, disciplinas, codigo, descricao);
        this.titualacao = titulacao;
        this.areaP = areaP;

    }

    public String getTitualacao() {
        return titualacao;
    }

    public String getAreaP() {
        return areaP;
    }

    public Curso getCurso() {
        return curso;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    

}
