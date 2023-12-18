class M 
{
	M()
	{	 super();
		System.out.println("M()");
	}
}
class N extends M
{
	N()
{
		//super()
		//IIB 
		super();
		System.out.println("N()");
}

	public static void main(String[] args) 
	{
		N n1 = new N();
		System.out.println("done");
	}
}
//in java object class is the super-most class.
//each class whether directly or indirectly object class.
//in the object class we have many members which are required by all the classes in java(user or inbuilt)
//all those members would be inherited to all the classes by deafult.
