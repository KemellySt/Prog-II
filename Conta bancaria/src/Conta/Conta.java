package Conta;

public class Conta{
    
    private String nome;
    private int senha;
    private int numeroConta = 2222;
    private double saldo = 0.00;
    private double limite = 10;
    private double limiteTotal = 10;

    // Criar conta

    public Conta(){}
    
    public Conta(String nome, int senha){
        this.nome = nome;
        this.senha = senha;
    }
    
    public int getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public double getLimite(){
        return this.limite;
    }

    // Operações
    public boolean Sacar(double valor){

        if(valor > this.saldo + this.limite)
        {
            return false;
        }
            if(valor > this.saldo)
            {
                double diferença;
                diferença = valor - this.saldo;
                this.limite = this.limite - diferença;
                this.saldo = 0;
                return true;
            }
        else
        {
            this.saldo = this.saldo - valor;
            return true;
        }
    }

    public void Depositar(double valor){
        double divida = this.limiteTotal - this.limite;
        if(divida > 0){
            this.limite += divida;
            this.saldo = valor - divida;
            return;
        }
        this.saldo = this.saldo + valor;
    }
}
