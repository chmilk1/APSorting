package insertion;

import static org.junit.Assert.*;

import org.junit.Test;

public class APTester {
int[] testArray = {1,7,12,15,24,33,48,61,67,82,91};

	@Test
	public void testInsert() {
		Inserter FastInserter = new Inserter();
		int[] array = {1,5,6,8,9,12};
		int[] wantedResult = {1,5,6,7,8,9,12};
		assertArrayEquals(wantedResult, FastInserter.insert(array, 7));
	}
	@Test
	public void testBSer(){
		System.out.println(testArray.length);
		BinarySearch finder = new BinarySearch();
		assertEquals(4, finder.logic(testArray, 24));
		//24 is the number
		
	}

}
