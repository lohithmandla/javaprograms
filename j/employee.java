class employee 
{
	static String companyname;
    static String companyaddress;
	int eno;
	String ename;
	double da,bsal,tsal,hra;
	static void setcompanydata(){
		companyname="lohith llc";
		companyaddress="hyd";
	}
	static  void printcompanydata()
	{
		System.out.println(companyname);
		System.out.println(companyaddress);
	}
	void setemp(int no,String name,double sal){
		eno=no;
		ename=name;
		bsal=sal;
	}
	void calculateda(){
		da=bsal*20/100;
	}
	void calculatehra(){
		hra=bsal*40/100;
	}
	void calculatetsal(){
		tsal=bsal+da+hra;
	}
		void printdata(){
		System.out.println(eno);
		System.out.println(ename);
		System.out.println(da);
		System.out.println(hra);
		System.out.println(tsal);
	}
	public static void main(String[] args) 
	{
		employee e1=new employee();
		employee.setcompanydata();
		employee.printcompanydata();
		e1.setemp(101,"lohith",100000.00);
		e1.calculateda();
		e1.calculatehra();
		e1.calculatetsal();
		e1.printdata();
		employee e2=new employee();
		e2.setemp(102,"lohi",100000.00);
		e2.calculateda();
		e2.calculatehra();
		e2.calculatetsal();
		e2.printdata();
	}
}
