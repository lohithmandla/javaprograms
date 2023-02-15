class code4 
{
	public static void main(String[] args) 
	{
		code4 c=new code4();
		System.out.println("additon is "+c.add(2,3));
        System.out.println("multification is "+c.mul(2,3));
		System.out.println("division is "+c.div(4,2));

	}
	    int add(int a,int b){
		int r=a+b;
		return r;
	}
        int mul(int a,int b){
		int r=a*b;
		return r;
	}
	    int div(int a,int b){
		int r=a/b;
		return r;
	}
}
