public class Conhecido extends Contato{
    
    private String email;

    public Conhecido() {
        super();
    }
    public Conhecido(String nome, String endereco, String email){

        super(nome, endereco);
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    @Override
    public String toString(){
        return super.toString() + "\nEmail: " + email;
    }
    
}
