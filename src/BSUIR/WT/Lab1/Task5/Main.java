package BSUIR.WT.Lab1.Task5;

import BSUIR.WT.Lab1.Task5.SequenceSeeker.SeuqnceSeeker;

import javax.sound.midi.Sequence;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		var scanner = new Scanner(System.in);
		final Random random = new Random();

		System.out.print("Enter length: ");
		int len = scanner.nextInt();
		int [] arr = new int[len];
		System.out.print("Start array: ");
		for (int i = 0; i < len; i++){
			arr[i] = random.nextInt(1, Integer.MAX_VALUE);
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		var sequenceSeeker = new SeuqnceSeeker();
		int result = arr.length - sequenceSeeker.findLongestSequence(arr);
		System.out.println("Result: " + result);

	}
}
