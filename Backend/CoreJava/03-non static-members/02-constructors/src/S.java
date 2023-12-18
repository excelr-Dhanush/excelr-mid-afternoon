class S 
{
	S()
	{
		System.out.println("s()");
		this(10); //this() calling statement must be the first staement in the contructor body.
	}
	S(int i)
	{
		System.out.println("S(int)");
	}
	public static void main(String[] args) 
	{

		System.out.println("main begin");
		S s1 = new S();
		System.out.println("-----------");
		S s2 = new S(10);
		System.out.println("----------");
	}
}
