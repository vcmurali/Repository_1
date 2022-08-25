package examTestCases;


public class Case_2 {

	public static void main(String[] args) {
		int value_a = 1;
		int value_b = 3;
		int[] values = {10,20,30,40,60,80,50,90};
		System.out.println("Addition Result: " + addition(value_a,value_b));
		System.out.println("Max: " + getmax(values));
	}
		
//-----------------------------------------------------------------------
	//Static method
	public static int addition(int i, int j) {
		int Result = i + j; 
		return (Result);
	}
//-----------------------------------------------------------------------

	public static int getmax(int[] values) {
		int max = values[0];
		for (int i = 0; i< values.length; i++) {
			if (values[i]> max) {
				max=values[i];
			}
			System.out.println(max);
		}
		return max;
	}			
			
			
			
}
