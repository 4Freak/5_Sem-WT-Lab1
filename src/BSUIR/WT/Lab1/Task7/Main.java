package BSUIR.WT.Lab1.Task7;

import BSUIR.WT.Lab1.Task7.Sorter.Sorter;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		try(var scanner = new Scanner(System.in)){
			final Random random = new Random();

			System.out.print("Enter length: ");
			int len = scanner.nextInt();
			int [] arr = new int[len];
			System.out.print("Start array: ");
			for (int i = 0; i < len; i++){
				arr[i] = random.nextInt(1, 100);
				System.out.print(arr[i] + " ");
			}
			System.out.println();

			var sorter = new Sorter();
			sorter.shellSort(arr);
			System.out.print("Result: ");
			for (int i = 0; i < arr.length; i++){
				System.out.print(arr[i] + " ");
			}
		}
	}
}
