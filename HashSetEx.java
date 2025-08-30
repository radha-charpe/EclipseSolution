package com.arr;

import java.util.HashSet;

public class HashSetEx {
public static void main(String[] args) {
	int arr[]= {1,7,2,3,3,4,5,5};
	HashSet<Integer> set= new HashSet<>();
	for(int num:arr) {
		set.add(num);
	}
	for (int num: set) {
		System.out.println(num);
	}
}
}
