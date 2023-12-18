class P 
{
	P()
	{
		System.out.println("P()");
	}
	P(int i)
	{
		this();	
		//this is a keyword in java,we are using it has a calling statement
		//we can use this() calling statement inside a contructor
		//we can use this() statement inside a method
		//this() calling statement used to call current class contructors,if it is used within a constructor.
		System.out.println("P()");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		P p1 = new P();
		System.out.println("-----------");
		P p2 = new P(10);
		System.out.println("main end");
	}
}
