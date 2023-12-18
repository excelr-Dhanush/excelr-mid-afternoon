class  	 F
{
	int i; 
	F()
	{
		System.out.println("f()");
		i = 10;
	}
	public static void main(String[] args) 
	{
		F f1 = new F();
		System.out.println(f1.i);
	}
}
//contructors are used to i intialise the objects.