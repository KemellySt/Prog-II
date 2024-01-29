public class PrimeiroGrau extends Equacoes{

    private double a;
    private double b;
    private double x;

    public PrimeiroGrau(double a, double b, double x){
        this.a = a;
        this.b = b;
        this.x = x;
    }

    @Override
    public double ValorY(){
        double y = a*x + b;
        return y;
    }

    @Override
    public String toString(){
        return "Equação: f(x) = " + a + "x + " + b + "\n" + "Quando x = " + x + "\ny = " + ValorY();
    }
    
}
