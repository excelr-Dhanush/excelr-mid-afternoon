class B 
{
	B()
	{
	}
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("done");
	}
}
//we can also define the contructor
//contructors should be within a class and outside of any method
//if you are keeping one explict contructor then ,compiler will not be keeping
//no-argument default contructor.
//contuctors  treated are special type of methods internally,but they are not normal methods
//there is a difference b/w contructors and methods.
//contructors are going to be invoked while creting the object.
//compulsary there should be an object creation to invoke the contructor.in the beggining
//methods are giong to be invoked whenever we call them.
         //rules for contructors
 //	1.compulsory  contructor name should be a same as class name(case sensitive)
 //2.their  is no return type for a contructor.
 //3.compulsory contructors should be  a concrete,or defined,implemented ,it should be having atlest{}i,e body
 //what are all the similarites b/w contructors and methods.
 //parameter(any nos.,can be any type)
 //concrete,defined,implimented
 //both contructors are methods are access,specifier
 //we can have any no., of contructor AND methods in a class but arguments must be different
 //(for a group of contructors,for a group)