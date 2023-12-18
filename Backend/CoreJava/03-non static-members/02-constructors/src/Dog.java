class  	Dog
{
	//properties,attributes,  data maembers,fields
	String name, breed, gender,color;
	int age;
	double height,weight;
	Dog(String dogname, String dogbreed,String doggender,String dogcolor,int dogage, double dogheight, double dogweight)
	{
	   System.out.println("initializing dog object: begins");
	   name = dogname;
	   breed = dogbreed;
	   gender = doggender;
	   color = dogcolor;
	   age = dogage;
	   height = dogheight;
	   weight = dogweight;
	   System.out.println("initializing dog object: completed");
	}
	//behaviours ,members functions
	void bite()
	{
		System.out.println("bite");
	}
	void bark()
	{
		System.out.println("bark");
	}
	public static void main(String[] args) 
	{
			System.out.println("mian begin");
		Dog d1 = new Dog( "charlie", "lab","male","brown",2,2.8,5.8 );
		Dog d2 = new Dog("pinky","lab","female","pink",2,2.2,4.5);
			System.out.println("Name: " + d1.name + "Breed: " + d1.breed + "Genger: "+ d1.gender +"color: " + d1.color +
				"age" + d1.age+ "Height" + d1.height + "Weight " + d1.weight);
			d1.bite();
			System.out.println("----------");
			System.out.println("Name: " + d2.name + "Breed: " + d2.breed + "Genger: "+ d2.gender +"color: " + d2.color +
				"age" + d2.age+ "Height" + d2.height + "Weight " + d2.weight);
			d2.bark();
			System.out.println("main end");
				   
	}
}
