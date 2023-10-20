package exceptionHandling;

public class PersonAge {

	public static void main(String[] args) {
		// Person Age mentioned
		
		int age = 16;
		try {
			AgeValidator.ValidateAge(age);
			System.out.println("Age is Valid.");
		}
		catch (AgeValidationException e ) {
			System.out.println("Age Validation failed: " + e.getMessage());
			
			
			
			
			
			
		}
		

	}

}
