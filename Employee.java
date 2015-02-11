/* Write the definition for a new class named Employee that stores the following data for a single employee:
• The name of the employee (a String)
• The name of the employee’s supervisor (also a String)
• The employee’s annual salary (a double)
As with the other classes defined in this book, you should make sure that the instance variables containing these values 
are private and instead provide get and set methods to retrieve or change any of the values. 
For example, if the variable emp is an employee, you should be able to retrieve the name of the employee by writing
         emp.getName()
or double the employee’s salary by writing
         emp.setSalary(emp.getSalary() * 2);
You should also make sure that there is a constructor method that allows clients to initialize all these fields when
 a new Employee object is created, as in
         new Employee("Bob Cratchit", "Ebenezer Scrooge", 25.00)
 * 
 */
public class Employee {
	private String name;
	private String supervizor;
	private double salary;
	
	public Employee(String newName) {
		name = newName;
	}
	
	public Employee(String newName, String newSupervizor) {
		name = newName;
		supervizor = newSupervizor;
	}
	
	public Employee(String newName, String newSupervizor, double newSalary) {
		name = newName;
		supervizor = newSupervizor;
		salary = newSalary;
	}

	
	public String getName() {
		return name;
	}
	
	public String getSupervizor() {
		return supervizor;
	}
	
	public double setSalary(double x) {
		salary = x;
		return salary;
	}
	
	public double getSalary() {
		return salary;
	}
}
