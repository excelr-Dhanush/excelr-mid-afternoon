import java.util.Scanner;
class F
{
	public static void main(String[] args) 
	{
		System.out.println("enter your first name?");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		 System.out.println("Enter your next address?");
		 sc.nextLine();
		 String address = sc.nextLine();
		 System.out.println("Your name : " + name +"Your address:" + address);
			   //good practice to close the opened resource
			   sc.close();

	}
}
//nextFloat(),nextByte(),nextlong().