package exceptionHandling;

public class AgeValidationException extends Exception {
	public AgeValidationException(String Message) {
		super (Message);
	}

}
    class AgeValidator {
    	public static void ValidateAge (int age)
    			throws AgeValidationException {
    		if (age<=15) {
    			throw new AgeValidationException("Age should be above 15.");
    }
    
    }
    }