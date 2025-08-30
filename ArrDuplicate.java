package com.arr;

public class ArrDuplicate {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 3, 4, 4, 5, 1, 2 };
		int n = arr.length;
		int[] temp = new int[n];
		int count = 0;

		for (int i = 0; i < n; i++) {
			Boolean isduplicate = false;

			for (int j = 0; j < count; j++) {
				if (arr[i] == temp[j]) {
					isduplicate = true;
					break;
				}
			}

			if (!isduplicate) {
				temp[count] = arr[i];
				count++;

			}

		}
		for (int i = 0; i < count; i++) {
			System.out.println(temp[i]);
		}
	}
}
