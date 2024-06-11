
public class EmployeeFactory {

	public static Employee getEmployee(String typeEmployee) {
		if(typeEmployee.trim().equalsIgnoreCase("Web Developer")) {
			return new WebDeveloper();
		}
		else if(typeEmployee.trim().equalsIgnoreCase("Android Developer")) {
			return new AndroidDeveloper();
		}
		else {
			return null;
		}
	}
}
