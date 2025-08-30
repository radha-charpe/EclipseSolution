package com.arr;
// bubble sort
public class ArrSort {
	public static void main(String[] args) {
		int arr[] = { 1, 5, 3, 7, 2 };
		for(int  i=0;i<arr.length-1;i++) {
			for (int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					//swapping
					int temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		System.out.println("Sorted array");
		for(int num : arr) {
			System.out.println(num);
		}
	}
}
