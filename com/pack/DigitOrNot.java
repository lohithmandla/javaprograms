package com.pack;

import java.util.Scanner;

public class DigitOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a input");
		char ch=sc.next().charAt(0);
		if(ch>=48&&ch<=57)
			System.out.println("the given input is a digit");
		else
			System.out.println("the given input is not digit");

	}

}
