package BSUIR.WT.Lab1.Task3;

import BSUIR.WT.Lab1.Task3.Calculator.Calculator;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        try(var scanner = new Scanner(System.in)) {
            System.out.print("Enter a: ");
            double a = scanner.nextDouble();
            System.out.print("Enter b: ");
            double b = scanner.nextDouble();
            System.out.print("Enter h: ");
            double h = scanner.nextDouble();

            double curr = a;
            double result;
            var calculator = new Calculator();
            while (curr <= b) {
                result = calculator.calculateTg(curr);
                System.out.println(String.format("%.2f | %.2f", curr, result));
                curr += h;
            }
        }
    }
}
