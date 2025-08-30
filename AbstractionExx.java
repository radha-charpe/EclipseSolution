package com.day1;

class AbstractionExx extends  AbstractionEx{
 void sound() {
	 System.out.println("Bark");
 }
 public static void main(String[] args) {
	 AbstractionExx ex=new AbstractionExx();
	 ex.sound();
}
}
