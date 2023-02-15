import java.util.Scanner;
class input
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a integer");
		int a=sc.nextInt();
		System.out.println("enter a char");
		char b=sc.next().charAt(0);
		System.out.println("enter a string");
		String c=sc.next();
		System.out.println("enter a float value");
		float d=sc.nextFloat();
		System.out.println("enter a double");
		double e=sc.nextDouble();
		System.out.println("the integer value is"+a);
		System.out.println("the char value is"+b);
		System.out.println("the string value is"+c);
		System.out.println("the float value is"+d);
		System.out.println("the  value is"+e);

	}
}
