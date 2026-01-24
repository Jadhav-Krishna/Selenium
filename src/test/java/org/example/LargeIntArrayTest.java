package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LargeIntArrayTest {
	LargeIntArray largest;
	
	@BeforeMethod
	public void setup() {
		largest = new LargeIntArray();
	}
	
	@Test
	public void testLargestIntNormalArray() {
		int[] arr = {10,25,5,40,15};
		int result = largest.FindLargest(arr);
		Assert.assertEquals(result,40);
	}
	
	@Test
	public void testLargestIntWithNegativeNumbers() {
		int[] arr = {-10,-25,-5,-40,-15};
		Assert.assertEquals(largest.FindLargest(arr),-5);
	}
	
	@Test
	public void testLargestIntEmptyArray() {
		int[] arr = {};
		largest.FindLargest(arr);
	}
}
