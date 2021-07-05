package org.tvs;

import java.util.Scanner;

public class ifLoop {
public static void main(String[] args) {
	int a , b,c;
	Scanner s = new Scanner(System.in);
	a=s.nextInt();
	b=s.nextInt();
	c=s.nextInt();
	if (a>b&&a>c) {
		System.out.println(" a is g");
	}
	else if (b>a&&b>c) {
		System.out.println("b is gr");
	}
	
	else if(c==b&&b==c) {
		System.out.println("c nd b is equal");
	}
	else{
		System.out.println("c is g");
	}
}
}
