package com.day2;

public class LargestFromArray {
public static void main(String[] args) {
	int arr[]= {2,4,8,5,2,7};
	int max=0;
	for(int i=1;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}System.out.println(max);
}
}
