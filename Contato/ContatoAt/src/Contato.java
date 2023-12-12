public class Contato {
    
    private String nome;
    private String endereco;

    public Contato() {
        nome = "";
        endereco = "";
    }
    public Contato(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() { 
        return nome; }

    public String getEndereco() { 
        return endereco; }

    public String toString(){
        return "Nome: " + nome + "\nEndereço: " + endereco;
    }
}
