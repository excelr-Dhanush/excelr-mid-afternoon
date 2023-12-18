class  Student
{
	private int StudentId;
	private String studentName;
	private String studentDepartment;
	private int studentAge;
	private double studentSalary;

	Student(int studentID, String studentName,String studentDepartment,int studentAge,double studentSalary)
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentDepartment = studentDepartment;
		this.studentAge = studentAge;
		this.studentSalary = studentSalary;
	}
	public int getStudentId()
	{
		return studentId;
	}
	public void setStudentId(int studentId)
	{
		this.studentId = studentId;
	}
	
public String getStudentName()
	{
		return studentName;
	}
	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}
	public String getStudentDepartment()
	{
		return studentDepartment;
	}
	public void setStudentDepartment(String studentDepartment)
	{
		this.studentDepartment = studentDepartment;
	}
	 public int getStudentAge()
	{
		return studentAge;
	}
	public void setStudentAge(int studentAge)
	{
		this.studentAge = studentAge;
	}
	public double getStudentSalary()
	{
		return studentSalary;
	}
	public void setStudentSalary(double studentSalary)
	{
		this.studentSalary = studentSalary;
	}
}
class MainStudent
{
	public static void main(String[]args)
	{
		Student emp1 = new Student(1001,"dhanu","full stack",23,3000.0);
		System.out.println(emp1.getStudentId());
		System.out.println(emp1.getStudentName());
		System.out.println(emp1.getStudentDepartment());
		System.out.println(emp1.getStudentAge());
		System.out.println(emp1.getStudentSalary());
		System.out.println("-----------------");
		emp1.setStudentId(1001);
		emp1.setStudentName("Dhanu");
		emp1.setStudentDepartment("cs");
		emp1.setStudentAge(23);			 
		emp1.setStudentSalary(3000.0);
		System.out.println("-----------------");
		System.out.println(emp1.getStudentId());
		System.out.println(emp1.getStudentName());
		System.out.println(emp1.getStudentDepartment());
		System.out.println(emp1.getStudentAge());
		System.out.println(emp1.getStudentSalary());
}
}