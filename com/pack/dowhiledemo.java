package com.pack;

import java.util.Scanner;

public class dowhiledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int i=1;
		do {
			System.out.println(n+"*"+i+"="+(n*i));
			i++;
		}while(i<=10);
		

	}

}
