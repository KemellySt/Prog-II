public class Amigo extends Contato{
    
    private int dia;
    private int mes;
    private int ano;

    public Amigo() {
        super();
    }

    public Amigo(String nome, String endereco, int dia, int mes, int ano) {

        super(nome, endereco);
        if (dia > 0 && mes > 0 && ano > 0){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }

    @Override
    public String toString(){
        return super.toString() + "\nData:" + dia + "/" + mes + "/" + ano;
    }

    
}
