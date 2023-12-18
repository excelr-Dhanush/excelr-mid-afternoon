class  	 J
{
	int i;
	static int j;
	 static void method1()
	{
		System.out.println("from method1()");
	}
	void test1()
	{
		System.out.println("from test1()");
	}
}
class  K extends J 
{
	int k;
	static int L;
	 static void method2()
	{
		System.out.println("from method2()");
	}
	void test2()
	{
		System.out.println("test2()");
	}
}
class L extends K
{
	int m;
	static int n;
	 static void method3()
	{
		System.out.println("from method3()");
}
void test3()
	{
		System.out.println("from test3()");
}

	public static void main(String[] args) 
	{
		L obj = new I();
		System.out.println(obj.i + "," + L.j + ","+ obj.K +"," + L.l + "," + obj.m + "," + obj
	obj.test1();
	obj.test2();
	obj.test3();
	}
}
