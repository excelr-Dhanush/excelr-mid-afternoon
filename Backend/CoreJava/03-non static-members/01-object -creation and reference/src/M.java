class M
{
	void test1()

		{
		System.out.println("from test1");
	}
	static
	{
		M obj = new M();
		obj.test1();
}
}
//till java jdk 1.6 we could able to run a program without the main method,but from java jdk 1.7 compulsory
//we should be having the main method to run the class,
//because jvm will be looking for the main method  to run the class(initiallising the class dor running).