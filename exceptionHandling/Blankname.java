package exceptionHandling;

public class Blankname{ 
		public static void main(String[] args) {
			try {
				EmployeeName employee1= new EmployeeName("John", "Doe");
				System.out.println("Employee 1 Full Name: " +  employee1.getFullName() );
				
				EmployeeName employee2 =  new EmployeeName ("", "Smith");
				System.out.println("Employee 2 Full Name: " + employee2.getFullName());
			}
			catch (FirstNameofEmployee e) {
				System.out.println("Error: " + e.getMessage());
				
			}

		}

	} 
