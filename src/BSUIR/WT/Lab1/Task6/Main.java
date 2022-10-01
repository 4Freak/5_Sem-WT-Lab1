package BSUIR.WT.Lab1.Task6;

import BSUIR.WT.Lab1.Task6.MatrixCreateor.MatrixCreator;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		try (var scanner = new Scanner(System.in)) {
			final Random random = new Random();

			System.out.print("Enter length: ");
			int len = scanner.nextInt();
			int[] arr = new int[len];
			System.out.print("Start array: ");
			for (int i = 0; i < len; i++) {
				arr[i] = random.nextInt(1, 10);
				System.out.print(arr[i] + " ");
			}
			System.out.println();

			var matrixCreator = new MatrixCreator();
			var matrix = matrixCreator.createMatrix(arr);
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
