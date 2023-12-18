import java.util.Scanner;
class A 
{
	public static void main(String[] args) 
	{
		System.out.println("enter your first name");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Welcome: " + name );

	}
}
  //in case of next() method - reads the complete token in the form of a STring
  //token- a single charcter or a gruop of character without any space is called as token.
  //in java we have three types of stream 
  //1.input stream
  //2.output stream
  //3.error stream