package insertion;

public class BinarySearch {
	public int logic(int[] array, int num){
		int index = 0;
		int min = 0;
		int max = array.length;
		while (!(num == array[index])) {
		if (array[(max-min)/2 + min] > num) {
			max = (max-min)/2 + min;
		} else if (array[(max-min)/2 + min] < num) {
			min = (max-min)/2 + min;
		}
		}
		return 0;
		
	}
}
