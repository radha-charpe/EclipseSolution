package com.day2;

public class PalimdromeNumber {
public static void main(String[] args) {
	int num=111;
	int original=num;
	int reverse=0;
	while(num>0) {
		int digit=num%10;
		reverse=reverse*10+digit;
		num=num/10;
	}if(original==reverse) {
		System.out.println(original + " number is palindrome");
		
	}else {
		System.out.println(original  + " number is not palindrome");
	}
}
}
