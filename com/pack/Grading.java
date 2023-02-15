package com.pack;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter percentage");
		int p=sc.nextInt();
		if(p>=60)
			System.out.println("Divisoin 1");
		else if(p>=45)
			System.out.println("Divisoin 2");
		else if(p>=30)
			System.out.println("Divisoin 3");
		else
			System.out.println("fail");

	}

}

