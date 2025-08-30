package com.day2;

public class SecondLargest {
public static void main(String[] args) {
	int arr[]= {1,4,7,9,4};
	int largest=0;
	int SecondLargest=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>largest) {
			SecondLargest = largest;
			largest=arr[i];
		}else if(arr[i]>SecondLargest && arr[i]!= largest) {
			SecondLargest=arr[i];
			
		}
	}System.out.println(SecondLargest);
}
}
