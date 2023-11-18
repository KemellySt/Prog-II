package Programa;
public class Aluno {
    
    private Pessoa pessoa;
    private String matricula;
    private Curso curso;

    public Aluno(){

    }
    
    //Usando o construtor para receber todos os dados
    public Aluno(String nome, String endereco, String telefone, String cpf, String matricula, String nomeDocurso, String disciplinas, int codigo, String descricao){
    
        this.pessoa = new Pessoa(nome, endereco, telefone, cpf);
        this.matricula = matricula;
        this.curso = new Curso(nomeDocurso, disciplinas, codigo, descricao);
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public String getMatricula() {
        return matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    void mostrarAluno(){

            System.out.println("Nome: " + this.pessoa.getNome());
            System.out.println("Matrícula: " + this.getMatricula());
            System.out.println("Endereço: " + this.pessoa.getEndereco());
            System.out.println("Telefone:\n" + this.pessoa.getTelefone());
            System.out.println("Curso: " + this.curso.getNomeDocurso());
            System.out.println("Curso: " + this.curso.getDisciplinas());
            System.out.println("Curso: " + this.curso.getDescricao());

    }
}
