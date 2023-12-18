class  			 O
{
	O(int i)
	{
		 System.out.println("int()");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		O o1 = new O();	//we cant call this contructor defaulty,we must provide one no argument contructor.
		O o2 = new O(10);//we can only call this contructor
		System.out.println("main end");
	}
}
