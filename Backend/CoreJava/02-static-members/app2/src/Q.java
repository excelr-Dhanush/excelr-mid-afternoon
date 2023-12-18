class Q 
{
	static                              //static block can develop inside the class outside of any method.
	{                                   //all the static block can executed from top to bottom only once at the time of class is loading to the memory before the main method 
		System.out.println("Q-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("Q-main");
	}
}
//we can have many no. of static blocks.
//static block shouid be outside the main method.
//static block or SIB(static initializer block).