package BSUIR.WT.Lab1.Task8;

import BSUIR.WT.Lab1.Task8.SequenceAssemler.SequenceAssembler;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			final Random random = new Random();

			int[] a = new int[] {1, 3, 4, 13, 14, 18, 25, 26, 30, 33};
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
			int[] b = new int[] {2, 5, 6, 7, 15, 16, 20, 21, 27, 29};
			for (int i = 0; i < b.length; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.println();

			var sequenceAssembler = new SequenceAssembler();
			int[] result = sequenceAssembler.getId(a, b);
			System.out.print("Result: ");
			for (int i = 0; i < result.length; i++){
				System.out.print(result[i] + " ");
			}
		}
	}
}
