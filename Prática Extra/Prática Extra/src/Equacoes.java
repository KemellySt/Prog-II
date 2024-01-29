public abstract class Equacoes {
    
    private double a;
    private double b;
    private double x;

    public Equacoes(){
    }

    public abstract double ValorY();

    public String toString(){
        return "Equação: y =" + a + x + b + " = " + ValorY();
    }
}
