package Programa;

public class Curso {

    String nomeDocurso;
    Disciplinas[] disciplinas;
    int codigo;
    String descricao;

    public Curso(String nomeDocurso, String[] disciplinas, int codigo, String descricao){

        this.nomeDocurso = nomeDocurso;
        this.disciplinas = new Disciplinas[disciplinas.length];
        for(int i = 0; i < disciplinas.length; i++){
            this.disciplinas[i] = new Disciplinas(disciplinas[i]);
        }
        this.codigo = codigo;
        this.descricao = descricao;

    }

    public String getNomeDocurso() {
        return nomeDocurso;
    }

    public Disciplinas[] getDisciplinas() {
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
        System.out.println("Disciplinas: ");
        for(int i = 0; i < this.disciplinas.length; i++){
            System.out.println(this.disciplinas[i].getDisciplinas());
        }
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Descrição:\n" + this.descricao);

    }
}