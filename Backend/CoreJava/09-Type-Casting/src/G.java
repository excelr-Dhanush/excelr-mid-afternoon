class G 
{	  
	static void test(double d)
	{
		System.out.println("test(double):"+d);
		}
	public static void main(String[] args) 
	{
		int i = 100; //before sending to test method compilier will going upcast into 100.0. 
		test(i);
		System.out.println("Hello World!");
	}
}
