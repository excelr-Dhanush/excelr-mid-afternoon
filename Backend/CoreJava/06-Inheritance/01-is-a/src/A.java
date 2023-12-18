class  	  A
{
{
	int i;
}
class B extends A
{
	int j;
}
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}
/*
what are the basic pillars of object oriented programming?
What are the principles of object oriented programming?

1.Inharitance
2.Abstraction
3.Encapsulation
4.Polymorphism

Inhertiance
-----------
1.aquiring the properties and behaviours of another class(parent class).
2.Parent class ==> Base class  | child class ==> derived class(Sub class)

Types of Inheritance
1.Single
2.Multiple
3.Multilevel
4.Hybrid
5.Hierarcial

Note: By using 'extends' keyword we can achieve inheritance through classes[represented by solid line]
Note: By using 'implements' Keyword we can achieve inheritance through interfaces[represented by dotted line].
*/  