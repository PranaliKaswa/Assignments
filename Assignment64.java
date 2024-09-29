package p1;

public class Assignment64 {
	
	
	float salary;
	int student_id;
	String name;
	
	void student_details(int student_id, String name, float salary)
	{
		this.student_id = student_id; //this keyword is used to assign local var value to global var
		this.salary = salary;
		this.name = name;
		System.out.println("Class Topper");
	}
	
	
	
	public static void main(String[] args) {
		
		
		Assignment64 m1 = new Assignment64();
		m1.student_details(101, "pranali", 10000);
		System.out.println("The student details are->");
		System.out.println("Name : " +m1.name);
		System.out.println("Salary : " +m1.salary);
		System.out.println("Student_id : " +m1.student_id);
		/*System.out.println(m1.name);
		System.out.println(m1.salary);
		System.out.println(m1.student_id);
		*/
		
	}

}
