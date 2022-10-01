package BSUIR.WT.Lab1.Task4.PrimeChecker;

import java.util.ArrayList;

public class PrimeChecker {

	public ArrayList<Integer> getPrimeNumberID(int[] arr){
		var resultArray = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++){
			if (isPrimeNumber(arr[i])){
				resultArray.add(i);
			}
		}
		return resultArray;
	}

	public boolean isPrimeNumber(int num){
		for (int i = 2; i*i <= num; i++){
			if((num % i) == 0){
				return false;
			}
		}
		return true;
	}
}
