package org.example;

public class LargeIntArray {
	public int FindLargest(int[] arr) {
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Array must not be null or empty");
		}
		int max = arr[0];
		for (int num : arr) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}
}
