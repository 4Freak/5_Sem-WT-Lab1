package BSUIR.WT.Lab1.Task7.Sorter;

public class Sorter {

	public void shellSort(int[] arr){
		int i = 0;
		while (i < arr.length-1){
			if (arr[i] <= arr[i+1]){
				i++;
			}else{
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				if (i > 0) {
					i--;
				}
			}
		}
	}
}
