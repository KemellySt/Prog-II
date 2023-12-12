package Programa;

public class Professor {

    private String titualacao;
    private String areaP;
    private Disciplinas[] disciplinas;
    private Funcionario funcionario;

    public Professor(String titulacao, String areaP, String nome, String cpf, String endereco, String telefone,
            String ctps, Double salario, String[] disciplinas) {

        this.funcionario = new Funcionario(nome, cpf, endereco, telefone, ctps, salario);
        this.disciplinas = new Disciplinas[disciplinas.length];
        for (int i = 0; i < disciplinas.length; i++) {
            this.disciplinas[i] = new Disciplinas(disciplinas[i]);
        }
        this.titualacao = titulacao;
        this.areaP = areaP;

    }


    public String getTitualacao() {
        return titualacao;
    }

    public String getAreaP() {
        return areaP;
    }

    public Disciplinas[] getDisciplinas() {
        return disciplinas;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    void mostrarProfessor() {

        System.out.print("\n");
        System.out.print("--> Dados do Docente\n");
        System.err.print("\n");
        this.funcionario.mostrarFuncionario();
        System.out.println("Titulação: " + this.titualacao);
        System.out.println("Área de Pesquisa: " + this.areaP);
        System.out.println("Disciplinas: ");
        for(int i = 0; i < this.disciplinas.length; i++){

            System.out.println(this.disciplinas[i].getDisciplinas());

        }
    }

}
