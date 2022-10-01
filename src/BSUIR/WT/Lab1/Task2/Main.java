package BSUIR.WT.Lab1.Task2;

import BSUIR.WT.Lab1.Task2.Area.Area;
import BSUIR.WT.Lab1.Task2.Area.Flat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (var scanner = new Scanner(System.in)) {
            Area taskArea = new Area(
                    new Flat[]{
                            new Flat(-6, 6, 0, -3),
                            new Flat(-4, 4, 5, 0)
                    }
            );

            System.out.print("Enter x: ");
            double x = scanner.nextDouble();
            System.out.print("Enter y: ");
            double y = scanner.nextDouble();
            boolean result = taskArea.isContain(x, y);
            System.out.println("Result:s " + result);
        }
    }
}
