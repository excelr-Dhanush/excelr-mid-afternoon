class D
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");           //main bagin
		int i = 0;                                  //body :o          i=0,1,2
		do
		{                                           //body :2
			                                        //main end :5
			System.out.println("body:" + i);
			i++;
		
			}
		
		while ((i++ == 1) || (i++ == 2));
		System.out.println("main end" + i);
	}
}
