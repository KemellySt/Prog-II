public class Agenda {
    
    private Contato contatos[];

    public Agenda(){

    }

    public Agenda(int quantidade) {
        contatos = new Contato[quantidade];
    }

    public void addContato(Contato contato, int tamanho){
        contatos[tamanho] = contato;
    }

    public void Impressão(int tamanho, Contato contato){
        for(int a = 0; a < tamanho; a++){

            if (contato instanceof Amigo){
                System.out.println("Amigo:\n" + contatos[a]);
            }
            else if (contato instanceof Conhecido){
                System.out.println("Conhecido:\n" + contatos[a]);
            }
            else{
                System.out.println("Desconhecido");
            }
        }
    }

}
