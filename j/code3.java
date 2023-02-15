class code3 
{
	static int x;
	int y;
	public static void main(String[] args) 
	{
		code3.setx(10);
		code3 c=new code3();
		c.sety(20);
		System.out.println(x+","+c.y);
	}
	static void setx(int a){
		x=a;
	}
	void sety(int b){
		y=b;
	}
}
