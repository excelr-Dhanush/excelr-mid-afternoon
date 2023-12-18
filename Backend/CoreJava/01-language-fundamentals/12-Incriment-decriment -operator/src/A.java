class  A
{
	public static void main(String[] args) 
	{
		int i = 0;
		//the value remains the same for the immediate usage,from the next usage modified value will be visible
		//i = i + 1;
		System.out.println(i++);//0
		System.out.println(i);//1
		System.out.println(i);//1
	}
}
