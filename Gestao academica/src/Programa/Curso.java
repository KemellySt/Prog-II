package Programa;

public class Curso {

    String nomeDocurso;
    String disciplinas;
    int codigo;
    String descricao;

    public Curso(String nomeDocurso, String disciplinas, int codigo, String descricao){

        this.nomeDocurso = nomeDocurso;
        this.disciplinas = disciplinas;
        this.codigo = codigo;
        this.descricao = descricao;

    }

    public String getNomeDocurso() {
        return nomeDocurso;
    }

    public String getDisciplinas() {
        return disciplinas;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    void mostrarCurso(){

        System.out.println("Nome do curso: " + this.nomeDocurso);
        System.out.println("Disciplinas\n" + this.disciplinas);
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Descrição:\n" + this.descricao);

    }
}