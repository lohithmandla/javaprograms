import java.util.Scanner;
class calculator
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		int sum=a+b;
		int diff=a-b;
		int mul=a*b;
		int q=a/b;
		int r=a%b;
		System.out.println("the sum of "+a+" and "+b+" is "+sum);
		System.out.println("the differance of "+a+" and "+b+" is "+diff);
		System.out.println("the multification of "+a+" and "+b+" is "+mul);
		System.out.println("the quotient of "+a+" and "+b+" is "+q);
		System.out.println("the reminder of "+a+" and "+b+" is "+r);
	}
}
