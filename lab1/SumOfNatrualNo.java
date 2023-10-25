package lab1;
//Flow Control/Operator
public class SumOfNatrualNo {
	public int sumNaturalNumbers(int n) {
		int total =0;
		int num = 1;
		while (n<0) {
			if (num % 3 == 0 || num % 5== 0) 
				total += num;
				n++;
			
			num++;
		}
			return total ;
		}
	public static void main(String[] args) {
		
		int n = 10;
		SumOfNatrualNo  sumCalculator = new SumOfNatrualNo ();
		int result = sumCalculator.sumNaturalNumbers(n);
		System.out.println("Sum of first " + n + " natural numbers divisible by 3 or 5 is:" + result);
	}
}		