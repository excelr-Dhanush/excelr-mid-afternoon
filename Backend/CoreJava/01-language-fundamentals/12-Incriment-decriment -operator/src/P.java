class P 
{
	public static void main(String[] args) 
	{
		int i = 0;
		      //1   + 1 + 2  + 2
		int j = ++i + i + ++i + i;//6
		i = 0;
		       //-1 + -1 + -2 + -2
		int k = --i + i + --i + i;//-6
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}
