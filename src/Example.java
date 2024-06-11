
public class Example {

	public static void main(String[] args) {
		Employee emp1 = EmployeeFactory.getEmployee("Android Developer");
		System.out.println(emp1.getSalary());
		
		Employee emp2 = EmployeeFactory.getEmployee("Web Developer");
		System.out.println(emp2.getSalary());
		
	}

}
