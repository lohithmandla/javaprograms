class code5
{
	int eno;
	String ename;
	Double esalary;
	public static void main(String[] args) 
	{
		code5 c=new code5();
		c.setnum(10);
		c.setname("lohith");
		c.setsalary(100000.00);
		int n=c.getnum();
		String s=c.getname();
		Double sal=c.getsalary();
		System.out.println(n);
		System.out.println(s);
		System.out.println(sal);

	}
	void setnum(int num)
	{
		eno=num;

	}
	void setname(String name){
		ename=name;
	}
	void setsalary(Double salary){
		esalary=salary;
	}
	int getnum(){
		return eno;
	}
	String getname(){
		return ename;
	}
	Double getsalary(){
		return esalary;
	}
}
