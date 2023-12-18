class A 
{
	A()
	{
			 System.out.println("A()");
	}
	//instance initialization block - IIB
	//if their is a common implementation for all the objects then we can keep that inside the IIB block.
	//all the IIB blocks gets executed from top to bottom for one object creation before the execution of contructor-
	//-only once .
	{
		System.out.println("IIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A a1 =new A();
		System.out.println("----------");
		A a2 = new A();
		System.out.println("------------");
	}
}
