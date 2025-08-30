package com.day2;

public class Fibonacci {
public static void main(String[] args) {
	int limit=10;
	int num1=0;
	int num2=1;
	for (int i=0;i<limit;i++) {
		System.out.println(num1);
		int num=num1+num2;
		num1=num2;
		num2=num;
	}
}
}
