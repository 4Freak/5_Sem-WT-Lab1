package BSUIR.WT.Lab1.Task8.SequenceAssemler;

public class SequenceAssembler {

	public int[] getId(int[] a, int[] b){
		var idArr = new int[b.length];

		int lastBId = 0;
		for (int i = 0; i < a.length-1; i++){
			while ((lastBId < b.length) && a[i] < b[lastBId] && a[i+1] > b[lastBId]){
				idArr[lastBId] = i;
				lastBId++;
			}
		}
		int i = a.length;
		for (int j = lastBId; j < b.length; j++){
			idArr[j] = i++;
		}
		return idArr;
	}
}
