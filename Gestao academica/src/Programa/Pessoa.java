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

    public void mostrarPessoa(){

        System.out.println("Carregando...");
        System.err.println(
                "============================ INFORMAÇÕES ============================");
        System.out.print("\n");
        System.out.print("--> Dados Pessoa\n");
        System.err.print("\n");
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("CPF: " + this.cpf);
    }


}
