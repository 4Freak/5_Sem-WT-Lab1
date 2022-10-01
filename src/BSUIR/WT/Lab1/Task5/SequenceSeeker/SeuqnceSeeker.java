package BSUIR.WT.Lab1.Task5.SequenceSeeker;

public class SeuqnceSeeker {

	public int findLongestSequence(int[] arr){

		int longestSequence = 0;
		for (int i = 0; i < arr.length-1; i++){
			int currentLen = 1;
			int lastId = i;
			for (int j = i+1; j < arr.length; j++){
				if (arr[j] > arr[lastId]) {
					currentLen++;
					lastId = j;
				}
			}
			if (currentLen > longestSequence){
				longestSequence = currentLen;
			}
		}
		return longestSequence;
	}
}
