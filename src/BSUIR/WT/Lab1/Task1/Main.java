package BSUIR.WT.Lab1.Task1;

import BSUIR.WT.Lab1.Task1.Calculator.Calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        try(var scanner = new Scanner(System.in)){
            System.out.print("Enter x: ");
            double x = scanner.nextDouble();
            System.out.print("Enter y: ");
            double y = scanner.nextDouble();

            var calculator = new Calculator();
            double result = calculator.calculate(x, y);
            System.out.println("Result: " + result);
        }
    }
}
