package BSUIR.WT.Lab1.Task1.Calculator;

public class Calculator {
    public double Calculate(double x, double y){
        double result = Math.sin(x + y);
        result = result * result + 1;
        double denominator = x - (2*x)/(1+x*x*y*y);
        denominator = Math.abs(denominator) + 2;
        result = result / denominator;
        return result;
    }
}
