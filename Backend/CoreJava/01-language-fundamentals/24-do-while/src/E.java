class E
{
	public static void main(String[] args) 
	{
		         
		int i = 0;                                  
		do
		{                                           
			                                       //begin:0   i=0,1,2,3
			System.out.println("begin:" + i);      //end:1
			i++;                                   //begin:2
		if(i>3)                                     //end:2
			{                                        //begin:3
			continue;                                  //
			}
			System.out.println("end: " + i);
			}
		
		while (i < 10);
	}
}
