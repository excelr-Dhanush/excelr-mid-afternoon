class  A
{
	static int x;
	A()
	{
		x +=10;
	}
	{
		x += 20;		  //all the static members are the part of each and every objects of a class
	}					  //all the static mmembers of a class belongs to each and every objects of a class.
	void test1()
	{
		x +=30;
	}
	static void test2()
	{
		x += 40;
	}
	public static void main(String[] args) 
	{
		System.out.println("A:" + x);
		A a1 = new A();
		System.out.println("B: " + x);
		a1.test1();
		System.out.println("C: " +x);
		a1.test2();						 //by defaulty "a1" replaces with "A" by compiler itself.
		System.out.println("D: " + x);
	}
}
