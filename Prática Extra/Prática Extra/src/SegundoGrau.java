public class SegundoGrau extends Equacoes{
    
    private double a;
    private double b;
    private double c;
    private double x;

    public SegundoGrau(double a, double b, double c, double x){

        this.a = a;
        this.b = b;
        this.c = c;
        this.x = x;

    }

    @Override
    public double ValorY(){
        double y = a*x*x + b*x + c;
        return y;
    }

    @Override
    public String toString(){
        return "Equação: f(x) = " + a + "x² + " + b + "x + " + c + "\n" + "Quando x = " + x + "\ny = " + ValorY();
    }
}
