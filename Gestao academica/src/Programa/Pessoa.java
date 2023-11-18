package Programa;

public class Pessoa{

    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    public Pessoa(String nome, String endereco, String telefone, String cpf){
        
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }


}
