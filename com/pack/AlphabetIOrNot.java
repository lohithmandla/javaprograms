package com.pack;

import java.util.Scanner;

public class AlphabetIOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a input");
		char ch=sc.next().charAt(0);
		if(ch>=65&&ch<=90||ch>=97&&ch<=123)
			System.out.println("the given input is a alphabet");
		else
			System.out.println("the given input is not alphabet");


	}

}
