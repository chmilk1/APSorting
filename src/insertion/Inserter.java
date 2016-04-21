package insertion;

public class Inserter {
	boolean printCode = false;

	public int[] insert(int[] array, int num) {
		int[] retarray = new int[array.length + 1];
		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] <= num && array[i] > num) {
				
				for (int j = 0; j < i; j++) {
					retarray[j] = array[j];
				}
				retarray[i] = num;
				for (int j = i; j < retarray.length - 1; j++) {
					retarray[j + 1] = array[j];
				}
			}
		}
		if (printCode) {
			for (int i : retarray) {
				System.out.println(i);
			}
		}
		return retarray;

	}

}
