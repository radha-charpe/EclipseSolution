package com.day2;

import java.util.Scanner;

public class IsPrime {
public static void main(String[] args) {
// takes input frm the usr
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number :");
	int num = sc.nextInt();
//prime logic
	boolean isPrime=true;
	 if(num<=1) {
		 isPrime=false;
		 
	 }
	 else {
		 for(int i=2;i<=num/2;i++) {
			 if(num%i==0) {
			 isPrime=false;
			 }
		 }
	 }
	 if(isPrime) {
		 System.out.println(num +" is a prime number");
	 }else {
		 System.out.println(num +"is not a prime number");
	 }
	
}
}
