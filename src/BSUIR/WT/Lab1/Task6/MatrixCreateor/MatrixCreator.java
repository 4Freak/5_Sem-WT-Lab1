package BSUIR.WT.Lab1.Task6.MatrixCreateor;

public class MatrixCreator {

	public int[][] createMatrix(int[] arr){
		int[][] resultMatrix = new int [arr.length][arr.length];

		int k = 0;
		for(int i = 0; i < arr.length; i++){
			k = i;
			for(int j = 0; j < arr.length; j++){
				resultMatrix[i][j] = arr[k];
				k = k+1;
				k = k % arr.length;
			}
		}
		return resultMatrix;
	}
}
