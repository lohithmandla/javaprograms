package com.pack;

import java.util.Scanner;

public class AlpahabetOrDigitOrSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a input");
		char ch=sc.next().charAt(0);
		if(ch>=65&&ch<=90||ch>=97&&ch<=123)
			System.out.println("the given input is a alphabet");
		else if(ch>=48&&ch<=57)
			System.out.println("the given input is digit");
		else
			System.out.println("the given input is special character");
			

	}

}
