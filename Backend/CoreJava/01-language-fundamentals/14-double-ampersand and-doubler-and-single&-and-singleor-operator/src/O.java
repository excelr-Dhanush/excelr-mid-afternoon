class O
{
	public static void main(String[] args) 
	{
			int i = 0;
	        // in bitwise operator it will be checking for both LHS and RHS	
		boolean flag =  (!(!(!((i++ == 0) && (i++ == 0) & (i++ == 0) & (i++ == 0 ) && ((i++ == 4) | (i++ == 6)))))
		if (flag)
		{
		System.out.println("from if");
		i++;
	    }
		System.out.println("end of main");
	System.out.println(i);
	}


}
