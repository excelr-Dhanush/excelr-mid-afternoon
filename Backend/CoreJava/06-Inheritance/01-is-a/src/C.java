class  	  C
{
	void test1()
	{
		System.out.println("from test1");
}
class D extends C
{
	void test2()
	{
	 System.out.println("from test2");
}
	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println(d1.1);
		System.out.println(d1.2);
	}
}
}