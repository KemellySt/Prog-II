package Programa;

public class Funcionario {

    private Pessoa pessoa;
    private String ctps;
    private Double salario;

    public Funcionario(String nome, String cpf, String telefone, String endereco, String ctps, Double salario) {

        this.pessoa = new Pessoa(nome, cpf, telefone, cpf);
        this.ctps = ctps;
        this.salario = salario;

    }

    void mostrarFuncionario() {

        System.out.println("Carregando...");
        System.err.println(
                "----------------------------------INFORMAÇÕES--------------------------------");
        System.out.print("\n");
        System.out.print("--> Dados Funcuonário\n");
        System.err.print("\n");
        System.out.println("Funcionário: " + this.pessoa.getNome());
        System.out.println("Endereço: " + this.pessoa.getEndereco());
        System.out.println("Telefone: " + this.pessoa.getTelefone());
        System.out.println("CPF: " + this.pessoa.getCpf());
        System.out.println("Salário: " + this.salario);
        System.out.println("CTPS: " + this.ctps);
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public String getCtps() {
        return ctps;
    }

    public Double getSalario() {
        return salario;
    }

}
