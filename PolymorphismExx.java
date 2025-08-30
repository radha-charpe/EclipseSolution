package com.day1;

public class PolymorphismExx extends PolymorphismEx{
public static void main(String[] args) {
	PolymorphismExx ex=new PolymorphismExx() ;
	ex.add(12,12 );
	ex.add(12,12 , 12);
System.out.println(ex.add(12,12 ));
System.out.println(ex.add(12, 12, 12));
	}
@Override
public int add(int a,int b) {
	return a+b+5;
	
}

}

