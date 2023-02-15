class bank 
{
	static String bankname,bankaddress;
	int accno;
	double cbal;
	static void setBankData(){
		bankname="sbi";
		bankaddress="hyd";
	}
	static void printbank(){
		System.out.println("bank name is"+bankname);
		System.out.println("bank address is"+bankaddress);
	}
	void createaccount(int no,double amt){
		accno=no;
		cbal=amt;
	}
	void deposit(double amt){
		cbal=cbal+amt;
		}
	void withdraw(double amt){
			cbal=cbal-amt;
		}
	void print(){
		System.out.println("cureent balance is"+cbal);
	}
	public static void main(String[] args) 
	{
		bank.setBankData();
		bank.printbank();
		bank b1=new bank();
		b1.createaccount(1234,1000.00);
		b1.deposit(5000.00);
		b1.print();
		bank b2=new bank();
		b1.createaccount(1235,5000.50);
		b1.withdraw(2000.00);
		b1.print();
	}
}
