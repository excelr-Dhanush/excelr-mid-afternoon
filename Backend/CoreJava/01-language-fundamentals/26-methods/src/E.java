class E
{
	public static void test()//public is the access specifier
	{
     System.out.println("from test")
	}
	public static void main(String[] args)//args are also called as signature or parameter
	{
	    System.out.println("from main begin");
		test();
	    System.out.println("from main end");
    }
	
}

