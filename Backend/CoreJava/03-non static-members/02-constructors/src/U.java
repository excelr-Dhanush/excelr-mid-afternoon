class U  
{
	U()
	{
		this(10);				   //recursive invocation is not possible,the argument is calling agian and again it will not come out.
		System.out.println("U()");
	}
	U(int i)
	{
		this();
		System.out.println("U(int)");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		U u1 = new U();
		System.out.println("----------");
		U u2 = new U(10);
		System.out.println("----------");
	}
}
