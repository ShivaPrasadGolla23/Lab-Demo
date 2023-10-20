package exceptionHandling;

class FirstNameofEmployee  extends Exception {
public  FirstNameofEmployee (String message){
super (message);
}
}
class EmployeeName {
private String firstName;
private String lastName;
public EmployeeName(String firstName, String lastName)
		throws FirstNameofEmployee {
if (firstName.isBlank()|| lastName.isBlank()) {
throw new FirstNameofEmployee("First name and last name cannot be blank.");
				}
this.firstName = firstName;
this.lastName = lastName;
			}
public String getFullName() {
return firstName + " " + lastName;
	}
	}
	