package exceptionHandling;
/**
 * EmployeeName of First Name and Last Name
 * @author sgolla
 *
 */
public class BlankName{ 
		public static void main(String[] args) {
			try {
				EmployeeName employee1= new EmployeeName("Hari", "Vardhan");
				System.out.println("Employee 1 Full Name: " +  employee1.getFullName() );
				
				EmployeeName employee2 =  new EmployeeName ("", "Shankarm");
				System.out.println("Employee 2 Full Name: " + employee2.getFullName());
			}
			catch (FirstNameofEmployee e) {
				System.out.println("Error: " + e.getMessage());
				
			}

		}

	} 
