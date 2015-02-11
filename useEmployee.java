import acm.program.*;

public class useEmployee extends ConsoleProgram {
	public void run() {
		Employee Bob = new Employee("Bob");
		println(Bob.getName());
		
		Employee Florin = new Employee("Florin Popa","Mihai Babusca",1000);
		println(Florin.getName());
		println(Florin.getSupervizor());
		println(Florin.setSalary(1200));
		println(Florin.setSalary());		
	}
}
