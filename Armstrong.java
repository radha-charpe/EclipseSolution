package com.day2;

public class Armstrong {
public static void main(String[] args) {
	int num=253;
	int original = num;
	int sum=0;
	while(num>0) {
		int digit=num%10;
		sum+=digit*digit*digit;
		num=num/10;
	}
	if(original==sum) {
		System.out.println(original +" is armstrong number");
}else {
	System.out.println(original +" is  not armstrong number");
}
}
}