import java.util.Scanner;
class E 
{
	public static void main(String[] args) 
	{
		System.out.println("ARE you in the class?");
		Scanner sc = new Scanner(System.in);
		boolean status = sc.nextBoolean();
		if(status)
		{

		System.out.println("status is good");
		}
		else
		{
			System.out.println(" Focus");
		}

	}
}
